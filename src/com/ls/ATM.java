package com.ls;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Initialize account balance to $1000
        int balance = 1000;

        System.out.println("Welcome to the ATM!");
        System.out.println("What would you like to do?");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Quit");

        // Get user input
        int choice = input.nextInt();

        // Process user input
        if (choice == 1) {
            System.out.println("Your balance is $" + balance);
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            int amount = input.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("Your new balance is $" + balance);
            }
        } else if (choice == 3) {
            System.out.println("How much would you like to deposit?");
            int amount = input.nextInt();
            balance += amount;
            System.out.println("Your new balance is $" + balance);
        } else if (choice == 4) {
            System.out.println("Thank you for using the ATM!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }


	}


