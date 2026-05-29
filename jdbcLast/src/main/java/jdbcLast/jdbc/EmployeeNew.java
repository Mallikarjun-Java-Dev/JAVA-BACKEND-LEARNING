package jdbcLast.jdbc;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeNew {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
Class.forName("com.mysql.cj.jdbc.Driver");
 Connection c=DriverManager.getConnection("jdbc:mysql://Localhost:3306/empdb","root","root");
  Statement s=c.createStatement();
//  s.execute("create database empdb");
//  System.out.println("database created");
// 
s.execute("create table emp_det2(id int, name varchar(40))");
System.out.println("table created");
Scanner sc=new Scanner(System.in);

CallableStatement cs1=c.prepareCall("{call insert_emp(?,?)}");
System.out.println("enter id");
int id1=sc.nextInt();
cs1.setInt(1, id1);

System.out.println("enter name");
String name1=sc.next();
cs1.setString(2,name1);
cs1.execute();
System.out.println("values inserted");

//update
//PreparedStatement ps2           incomplete 
	
}}


//drabacks of jdbc
//javadev shoud know sql querries
//cant create object
//cant use oops concepts
//cant use collection framework
//cant use multithreading concepts
//cant use exception handling concepts
//cant use file handling concepts
//cant use network programming concepts
//cant use awt and swing concepts
//cant use java 8 features
//cant use java 9 features
//cant use java 10 features
//therefore we use hibernate framework






//hibernate notes
//hibernate is an object relational mapping framework
//hibernate is a open source framework
//hibernate is a light weight framework
//hibernate is a persistence framework
//hibernate is a framework which is used to perform crud operations on database tables using oops concepts
//hibernate is a framework which is used to perform crud operations on database tables using collection framework
//hibernate is a framework which is used to perform crud operations on database tables using multithreading concepts
//types of hibernate
//1. hibernate core
//2. hibernate annotation
//advantages of hibernate
//1. hibernate is a framework which is used to perform crud operations on database tables using oops concepts