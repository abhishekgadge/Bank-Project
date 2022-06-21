package Bank_Project;
import java.util.*;


public class BankApplication {

	public static void main(String[] args) {
		 System.out.println("List Of The Customers Who Opened Account In Amazon Bank:");
		 System.out.println("=================================================================================================");
		Customer c1=new Customer(456789,"Abhishek");
		Customer c2=new Customer(123456,"Amol");
		Customer c3=new Customer(678908,"Awanti");
		Customer c4=new Customer(456765,"Ashwini");
		Customer c5=new Customer(654345,"Kalyan");
		
		LinkedList<Customer> ls=new LinkedList<Customer>();
		ls.add(c1);
		ls.add(c2);
		ls.add(c3);
		ls.add(c4);
		ls.add(c5);
		System.out.println(ls);
		
		
        BankAccount ob=new BankAccount("Abhishek","161617");
        ob.showmenu();
	}

}
