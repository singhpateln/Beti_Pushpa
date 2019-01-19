package com.demo;
import java.sql.*;
import java.util.*;

public class Dbms_con {

	public static void main(String[] args) {
		while(true) {
		System.out.println("Welcome to MYDB\nFor Add Press 1\nFor select Press 2\nFor Update Press 3\nFor Delete Press 4");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		// to add data
		
		if(a==1)
		{ 
			System.out.println("Enter Student id");
			Scanner sc1 = new Scanner(System.in);
			int sid = sc1.nextInt();
			System.out.println("Enter Student name");
			Scanner sc2 = new Scanner(System.in);
			String sname = sc2.next();
			System.out.println("Enter Student city");
			Scanner sc3 = new Scanner(System.in);
			String scity = sc3.next();
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/nitesh","root","12345");  
			
			
			 String query = " insert into student (sid,sname,scity)"
				        + " values ("+sid+",'"+sname+"','"+scity+"')";
			
			 PreparedStatement pst = con.prepareStatement(query);
			
			 pst.execute();
			 System.out.println("Successfull Inserted");
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
		}
		
		// to select from data
		
		if(a==2)
		{
			System.out.println("Enter Student Id");
			Scanner sc4 = new Scanner(System.in);
			int b = sc.nextInt();
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/nitesh","root","12345");  
				
				 String query = "SELECT * FROM student where sid='"+b+"'";
				 
				 Statement st = con.createStatement();

				 ResultSet rs = st.executeQuery(query);
				  if(rs!=null)
				 {
					 System.out.println("Please Emter Correct ID");
				 }
				
				
				/* String query1 = "SELECT * FROM STUDENT WHERE sid=";
				 rs =st.executeQuery(query1);*/
				
				 while (rs.next())
			      {
			        int id = rs.getInt("sid");
			        String Name = rs.getString("sname");
			        String  City = rs.getString("scity");
			       
			        // print the results
			        System.out.println("Student Information");
			        System.out.format("%s, %s, %s\n", id, Name, City);
			      }
				 st.close();
				 
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
		}
		
		// For Update information
		
		if(a==3)
		{
			System.out.println("Enter Student Id");
			Scanner sc4 = new Scanner(System.in);
			int b = sc.nextInt();
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/nitesh","root","12345");  
				
				 String query = "SELECT * FROM student where sid='"+b+"'";
				 
				 Statement st = con.createStatement();

				 ResultSet rs = st.executeQuery(query);
				 
				
				 while (rs.next())
			      {
			        int id = rs.getInt("sid");
			        String Name = rs.getString("sname");
			        String  City = rs.getString("scity");
			       
			        // print the results
			        System.out.println("Student Information");
			        System.out.format("%s, %s, %s\n", id, Name, City);
			      }
				 System.out.print("Update Your Name");
				 Scanner sc5 = new Scanner(System.in);
				 String cname = sc5.next();
				 
				 String query1 = "update student set sname='"+cname+"' where sid='"+b+"' ";
				 PreparedStatement update = con.prepareStatement(query1);
				 update.executeUpdate();
				 System.out.print("Update Succesfully");
				 st.close();
				 
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
		}
		
		
		if(a==4)
		{ 
			System.out.println("Enter Student id");
			Scanner sc1 = new Scanner(System.in);
			int b = sc1.nextInt();
			
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/nitesh","root","12345");  
			
			
			 String query = "delete from student where sid = '"+b+"'  ";
			
			 PreparedStatement pst = con.prepareStatement(query);
			
			 pst.execute();
			 System.out.println("Delete Successfully");
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
		}
		
		
		System.out.println("\n");
		}
		
		
	}
	
	

}
