package com.tyss.fms.controller;

import java.util.Scanner;

public class AdminMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pass;
		String user;
		System.out.println("Enter Username:");
		user = sc.next();
		System.out.println("Enter password:");
		pass = sc.next();;

		if(user.equals("root") && pass.equals("root") ){
		   System.out.println("Login Successful....");
		   
		   System.out.println("1.client");
		   System.out.println("2.customer");
		   System.out.println("3.contractor");
		   System.out.println("4.product");
		   System.out.println("Enter your choice");
		   int choice=sc.nextInt();
		   switch (choice) 
		   {
		case 1:ClientMain.main(null);
			break;
		case 2:GetAllCustomers.main(null);
			break;
		case 3:ContractorMain.main(null);
			break;
		case 4:ProductMain.main(null);
			break;

		default:System.out.println("choose correct choice");
			break;
		}
		   
		}
		else{
			
			System.out.println("Please try again.");
		   
		}     
	}

}
