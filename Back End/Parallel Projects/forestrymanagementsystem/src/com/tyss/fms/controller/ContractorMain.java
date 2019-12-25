package com.tyss.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Contractor;
import com.tyss.fms.bean.dao.ContractorDAO;
import com.tyss.fms.factory.ContractorFactory;

public class ContractorMain
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		ContractorDAO dao=ContractorFactory.instanceOfContractorDAOImpl();
		
		while(true)
		{
			Contractor cont=new Contractor();
			System.out.println("1.insert  contractor");
			System.out.println("2.delete contractor");
			System.out.println("3.get all contractor");
			System.out.println("4.Go back to menu");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch (choice) 
			{
			case 1:System.out.println("Enter contractor no");
				cont.setContarctno(sc.nextInt());
				System.out.println("Enter contractor id");
				cont.setcontractid(sc.nextInt());
				System.out.println("Enter productid");
				cont.setProductid(sc.nextInt());
				System.out.println("Enter haulier id");
				cont.setHaulierid(sc.nextInt());
				System.out.println("Enter delivery date");
				cont.setDeliverydate(sc.nextInt());
				System.out.println("Enter delivery day");
				cont.setDeliveryday(sc.next());
				System.out.println("Enter quantity");
				cont.setQuantity(sc.nextInt());
				
				if(dao.insertContractor(cont))
				{
					System.out.println("successful...");
				}
				else
				{
					System.out.println("failed");
				}
				break;
			case 2:
				if(dao.deleteContractor(cont))
				{
					System.out.println("deleted");
				}
				else
				{
					System.err.println("something went wrong");
				}
				break;
			case 3:
				List<Contractor> list1=new ArrayList<Contractor>();
				list1=dao.getAllContractor(cont);
				for (Contractor c1 : list1) 
				{
					System.out.println(c1);
					
				}

			
				break;
			case 4:AdminMain.main(null);
					break;

			default:System.out.println("Enter correct choice");
				break;
			}
		}
		
	}

}
