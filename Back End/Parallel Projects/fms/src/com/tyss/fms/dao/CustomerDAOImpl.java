package com.tyss.fms.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.jdbc.Statement;
import com.tyss.fms.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO 
{
	FileReader reader;
	Properties prop;
	Customer cust;

	 public CustomerDAOImpl() {
		 try {
					
				
				reader=new FileReader("db.properties");
				prop=new Properties();
				prop.load(reader);
				
				Class.forName(prop.getProperty("driverClass"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}// TODO Auto-generated constructor stub
	}
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list=new ArrayList<Customer>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=(Statement) conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))
				)
				
		{
			while(rs.next())
			{
				Customer cust=new Customer();
				cust.setCustId(rs.getInt(1));
				cust.setCustName(rs.getString(2));
				cust.setAddress1(rs.getString(3));
				cust.setAddres2(rs.getString(4));
				cust.setTown(rs.getString(5));
				cust.setPostalCode(rs.getInt(6));
				cust.setEmail(rs.getString(7));
				cust.setPhone(rs.getInt(8));
				
				list.add(cust);//adding the data of userZBean class with user object passing in add() of list
				
			}
			return list;
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public List<Customer> getCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomer(Customer cust) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("updateQuery"));
				)
		{
			pstmt.setInt(2, cust.getCustId());
			pstmt.setString(1, cust.getEmail());
			
			
			
			int count=pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(Customer cust) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteQuery"));
				)
		{
			pstmt.setInt(1, cust.getCustId());
			
			
			
			
			int count=pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insertCustomer(Customer cust) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"));
				)
		{
			
			pstmt.setInt(1, cust.getCustId());
			pstmt.setString(2, cust.getCustName());
			pstmt.setString(3, cust.getAddress1());
			pstmt.setString(4, cust.getAddres2());
			pstmt.setString(5, cust.getTown());
			pstmt.setInt(6, cust.getPostalCode());
			pstmt.setString(7, cust.getEmail());
			pstmt.setInt(8, cust.getPhone());
			
			
			int count=pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
