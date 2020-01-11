package com.capgemini.phonesimulatorapplication.controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.List all contacts");
			System.out.println("2.Search");
			System.out.println("3.Operation");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				GetallContact.main(null);
				break;
			case 2:
				SearchContact.main(null);
				break;
			case 3:
				System.out.println("1.add Contact");
				System.out.println("2.delete contact");
				System.out.println("3.update contact");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					InsertContact.main(null);
					break;
				case 2:
					DeleteContact.main(null);
					break;
				case 3:
					UpdateContact.main(null);
					break;

				default:
					System.out.println("enter correct choice");
					break;
				}
				break;

			default:
				System.out.println("enter correct choice");
				break;
			}

		}
	}

}
