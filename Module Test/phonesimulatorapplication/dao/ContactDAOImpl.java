package com.capgemini.phonesimulatorapplication.dao;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class ContactDAOImpl implements  ContactDAO
{
	
	FileReader reader;
	Properties prop;
	ContactInfo con;

	 public ContactDAOImpl() {
		 try {
				
				
				reader=new FileReader("db.properties");
				prop=new Properties();
				prop.load(reader);
				
				Class.forName(prop.getProperty("driverClass"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
		 
		 
		 

	@Override
	public List<ContactInfo> getAllContact() {
		List<ContactInfo> list=new ArrayList<ContactInfo>();
		try(Connection conn=(Connection) DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=(Statement) conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))
				)
				
		{
			while(rs.next())
			{
				
				ContactInfo con=new ContactInfo();
				con.setName(rs.getString(1));
				con.setNumber(rs.getLong(2));
				con.setGroups(rs.getString(3));
				
				
				
				
				list.add(con);
				
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			}
			return null;
	}

	@Override
	public String getContact(String name) {
		List<ContactInfo> list1=new ArrayList<ContactInfo>();
		try(Connection conn=(Connection) DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=(Statement) conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("search1"))
				)
				
		{
			if(name==rs.getString(1))
			{
			
				return rs.getString(1);
				
				
			}
			;
		}
		catch (Exception e) {
			e.printStackTrace();
			}
			return null;

	}

	@Override
	public boolean updateContact(ContactInfo con) {
		try(Connection conn=(Connection) DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(prop.getProperty("updateQuery"));
				)
		{
			
			
			pstmt.setString(2,con.getName());
			pstmt.setString(1, con.getGroups());
			
			
			
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
	public boolean deleteContact(ContactInfo con) {
		try(Connection conn=(Connection) DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(prop.getProperty("deleteQuery"));
				)
		{
		
			
			pstmt.setString(1, con.getName());
			
			
			
			
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
	public boolean addContact(ContactInfo con)
	{
		try(Connection conn=(Connection) DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(prop.getProperty("insertQuery"));
				)
		{
			pstmt.setString(1, con.getName());
			pstmt.setLong(2, con.getNumber());
			pstmt.setString(3, con.getGroups());
			
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
