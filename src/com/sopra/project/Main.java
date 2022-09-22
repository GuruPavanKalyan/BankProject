package com.sopra.project;

import java.util.Scanner;

public class Main {
	//here we use display balance 
	static double accNum=123456;
	public static void displayBalance(int balance) {
		System.out.println("Current Balance : " + balance);
		System.out.println();
	}
// here we use withdraw amount
	public static int amountWithdrawing(int balance, int withdrawAmount) {
		System.out.println("Enter Your Withdrawing Amount : "+withdrawAmount);
		
		if (balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
			System.out.println("Success");
			displayBalance(balance);
		} else {
			System.out.println("No money");
			System.out.println();
		}
		return balance;
	}

	public static int amountDepositing(int balance, int depositAmount) {
		
		System.out.println("For Depositing enter Your Account Number:");
		Scanner sc= new Scanner(System.in); 
		double a = sc.nextDouble();
		
		if (a==accNum){
			
		
		System.out.println("Depositing Amount : " + depositAmount);
		balance = balance + depositAmount;
		System.out.println("Your Money has been successfully deposited");
		displayBalance(balance);
		
		}
		else {
			System.out.println("check your account number");
		}
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;
  
        // calling display balance
        displayBalance(balance);
        // withdrawing amount
        balance
            = amountWithdrawing(balance, withdrawAmount);
        // depositing amount
        balance = amountDepositing(balance, depositAmount);

	}

}
