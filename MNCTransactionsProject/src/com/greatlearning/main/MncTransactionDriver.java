package com.greatlearning.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.greatlearning.services.CompleteBinarySearchTree;

public class MncTransactionDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CompleteBinarySearchTree cbst = new CompleteBinarySearchTree();

		System.out.println("No. of Transactions to Enter ");
		int transactions = sc.nextInt();
		System.out.println("Enter Transaction Values:");
		for (int i = 1; i <= transactions; i++) {
			try {
				double transaction = sc.nextDouble();
				cbst.insert(transaction);
			} catch (InputMismatchException ie) {
				System.out.println("\t Invalid input type.... transaction must be number");
				sc.nextLine();
			}
		}
		try {
			cbst.convertTree();
			sc.close();
		} catch (Exception e) {
			System.out.println("program is going beyond the limit: " + e);
		}

	}

}
