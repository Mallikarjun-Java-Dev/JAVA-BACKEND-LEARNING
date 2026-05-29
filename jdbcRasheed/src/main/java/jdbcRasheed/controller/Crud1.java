package jdbcRasheed.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeee","root","root");
Statement s=c.createStatement();
System.out.println("database connected");
//s.execute("create database myDetails");
//System.out.println("database created");
//
//s.execute("create table mytable( sId int primary key,sName varchar(40) not null, sMobile long,sEmail varchar(40), sPassword varchar(20) unique not null  )");
System.out.println("Table created");
//add data 
}
}
