package com.tyss.fms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.fms.bean.Customer;
import com.tyss.fms.bean.Product;
import com.tyss.fms.bean.dao.ProductDAO;
import com.tyss.fms.factory.ProductFactory;

public class ProductMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ProductDAO dao=ProductFactory.instanceOfCustomerDAOImpl();
		
		while(true)
		{
			Product pd=new Product();
			System.out.println("1.insert  product");
			System.out.println("2.update product");
			System.out.println("3.delete product");
			System.out.println("4.get all products");
			System.out.println("5.Go back to menu");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter product id");
				pd.setPid(sc.nextInt());
				System.out.println("Enter product name");
				pd.setPname(sc.next());
				System.out.println("Enter product description");
				pd.setPdesc(sc.next());
				
				if(dao.insertProduct(pd))
				{
					System.out.println("inserted.....");
				}
				else
				{
					System.err.println("Something went wrong");
				}
				
				
				
				break;
			case 2:break;
			case 3:break;
			case 4:
				List<Product> list=new ArrayList<Product>();
				list=dao.getAllProducts(pd);
				for (Product p1 : list) 
				{
					System.out.println(p1);
					
				}
				
				break;
			case 5:AdminMain.main(null);
					break;

			default:System.out.println("choose correct choice");
				break;
			}
		}
		

	}

}
