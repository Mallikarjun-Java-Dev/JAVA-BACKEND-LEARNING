package jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrtDtbase {
public static void main(String[] args ) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspiders","root","root");
    Statement s=c.createStatement();
    System.out.println("database connected");
    
  //  s.execute("create database Qspiders");
    System.out.println("database created");
    
  //  s.execute("create table jobs");
//    s.execute("create table jobs(id int primary key, name varchar(40) not null, mobile long, loc varchar(40) )");
//    System.out.println("table created");
//    
    Scanner sc=new Scanner(System.in);
    
    //insert
  PreparedStatement p1=c.prepareStatement("insert into jobs values(?,?,?,?)");
  System.out.println("enter id");
  int id=sc.nextInt();
  p1.setInt(1,id);
  
  System.out.println("ente job name");
  String name=sc.next();
  p1.setString(2, name);
  
  System.out.println("enter mobilr number");
  long mobile=sc.nextLong();
  p1.setLong(3,mobile);
  
  System.out.println("enter location");
  String loc=sc.next();
  p1.setString(4,loc);
  
  p1.execute();
  System.out.println("values inserted");			
  
  
  
}
}
