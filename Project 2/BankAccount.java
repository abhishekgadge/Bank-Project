package Bank_Proj;
import java.util.*;

public class BankAccount {
        int balance=1000;
        int prevTransaction;
        String customerName;
        String customerID;
        
        BankAccount(String cname,String cid){
        	customerName = cname;
        	customerID = cid;
        }
        
        void deposit(int amt) {
        	if(amt!=0) {
        		balance=balance+amt;
        	}
        }
        
        void withdraw(int amt) {
        	if(balance<=1000){
        		
        		System.out.println("You cannot withdraw");
        	}
        	
        else {
        		balance = balance - amt;
        		prevTransaction =-amt;
        	}
        }
        
        void getPrevTransaction() {
        	if(prevTransaction >1000) {
        		System.out.println("Amount Desposited: "+prevTransaction);
        	}
        	else if(prevTransaction <1000) {
        		System.out.println("Amount Withdrawn: "+Math.abs(prevTransaction));
        	}
        	else {
        		System.out.println("No Transaction Occured");
        	}
        }
        
        void showmenu() {
        	char option='\0';
        	Scanner sc=new Scanner(System.in);
        	
        	
        	System.out.println("Welcome "+customerName);
        	System.out.println("Your ID is "+customerID);
        	System.out.println("\n");
        	System.out.println("A. Check Your Balance");
        	System.out.println("B. Deposit Amount To Bank");
        	System.out.println("C. Withdraw Amount From Bank");
        	System.out.println("D. See Your Previous Transaction");
        	System.out.println("E. Exit From Application");
        	
        	do 
        	{
        	 System.out.println("============================================================");
        	 System.out.println("Enter An Option to start Amdocs Bank");
        	 System.out.println("============================================================");
             option=sc.next().charAt(0);
        	 System.out.println("\n");
        	 
        	 switch(option)
        	 {
        	 case 'A':
        		 System.out.println("-------------------------------------------------");
        		 System.out.println("Balance= "+balance);
        		 System.out.println("--------------------------------------------------");
        		 System.out.println("\n");
        		 break;
        		 
        	 case 'B':
        		 System.out.println("---------------------------------------------------");
        		 System.out.println("Enter Amount to deposit:");
        		 System.out.println("-----------------------------------------------------");
        		 int amount = sc.nextInt();
        		 deposit(amount);
        		 System.out.println("\n");
        		 break;
        		 
        	 case 'C':
        		 System.out.println("-----------------------------------------------------");
        		 System.out.println("Enter the Amount to withdraw:");
        		 System.out.println("------------------------------------------------------");
        		 int amount2= sc.nextInt();
        		 withdraw(amount2);
        		 System.out.println("\n");
        		 break;
        		 
        	 case 'D':
        		 System.out.println("-----------------------------------------------------");
        		 getPrevTransaction();
        		 System.out.println("-----------------------------------------------------");
        		 System.out.println("\n");
        		 break;
             
        	 case 'E':
        		 System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        		 break;
        		 
        	default:
        		 System.out.println("Invalid option!! Please Try Again");
        		 break;
        		 
        		 
        		 
        	 }

        	}while(option != 'E');
        	
        	System.out.println("Thank You! Have a nice day.");
        	
        }
}
