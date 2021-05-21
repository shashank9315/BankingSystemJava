package com.banking;

import java.util.Scanner;

public class BankMain {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);


        int numberOfAccounts = 0;
        Bank C[] = new Bank[100];
        int ch;
        
        do {
        	 System.out.println("***************************************************************************************************");
            System.out.println("Main Menu\n1. Display All\n2. Search By Account\n3. Deposit\n4. Withdrawal\n5. Create Account \n6. Exit ");
            System.out.println("***************************************************************************************************");
                System.out.println("Ur Choice :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                    	if(numberOfAccounts == 0) {
                    		System.out.println("You Dont have Any Account Created. Please Create Account First");
                    	}
                    	else {
                    		System.out.println("*********************************************************");
                    		System.out.println("Below Are All the Account Details: ");
                    		System.out.println("********************************************************");
                        for (int i = 0; i < numberOfAccounts; i++) {
                            C[i].showAccount();
                        }
                    	}
                        break;

                    case 2:
                        System.out.print("Enter Account No U Want to Search...: ");
                        String acn = KB.next();
                        boolean found = false;
                        for (int i = 0; i < numberOfAccounts; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < numberOfAccounts; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < numberOfAccounts; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;
                     
                       case 5:
                    	   C[numberOfAccounts] = new Bank();
                    	   C[numberOfAccounts].openAccount();
                        	numberOfAccounts++;

                    case 6:
                        System.out.println("Good Bye..");
                        break;
                }
            }
            while (ch != 6);
        }
    }
