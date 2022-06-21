package bank;

import java.util.*;

public class BankingApp {  
    public static void main(String arg[]) throws Exception {  
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("Hello! Welcome to Amdocs Bank ");
        System.out.print("\nPlease Enter Number of Customers: ");  
        int n = sc.nextInt();  
        bank C[] = new bank[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new bank();  
            C[i].openAccount();  
        }  
        // loop runs until number 5 is not pressed to exit  
        int ch;  
        do {  
            System.out.println("\n Welcome to Amdocs Bank");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        long ac_no = sc.nextLong();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].contains(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.nextLong();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].contains(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.nextLong();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].contains(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("Goodbye! Regards From Amdocs");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }
