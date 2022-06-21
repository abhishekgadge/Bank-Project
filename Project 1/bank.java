package bank;

import java.util.*;  
public class bank {  
    private long Accno;
    private String Name;
    private String Address;
    private String acc_type;  
    private long Balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() throws Exception  {  
        System.out.print("Enter Account No: ");  
        Accno = sc.nextLong();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();
        System.out.print("Enter Name: ");  
        Name = sc.next();
        System.out.print("Enter Address: ");  
        Address = sc.next();
        System.out.print("Enter Balance: ");  
        Balance = sc.nextLong();  
        if(Balance>=1000)
        	System.out.println("Your Account Balance is: "+Balance);
        	else
        		throw new Exception("Maintain minimum Balance of 1000");
    }  
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + Name);  
        System.out.println("Account no.: " + Accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Address: " + Address);
        System.out.println("Balance: " + Balance);  
    }  
    //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        Balance = Balance + amt;  
        System.out.println("Balance after Deposit: " + Balance);
    }  
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (Balance >= amt) {  
            Balance = Balance - amt; 
            if (Balance >= 1000)
            	System.out.println("Balance after withdrawal: " + Balance);  
            else
            	System.out.println("Maintain Minimum Balance");  
            
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    //method to search an account number  
    public boolean contains(long ac_no) {  
        if (Accno==(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
