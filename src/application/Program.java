package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {
//
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double limisaque = sc.nextDouble();
		sc.nextLine();
		
		
		Account account = new Account(number, holder, balance, limisaque);  
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("New balance:  %.2f%n", account.getBalance());
		}
		catch (BusinessException e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("");
		
		
		sc.close();
	}

}
