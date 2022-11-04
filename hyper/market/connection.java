/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyper.market;

import java.sql.*;

public class connection {




public static void main(String[] args) {
    // TODO Auto-generated method stub

    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


    Connection myConn = DriverManager.getConnection(dbURL, user, pass);
    try {
    Statement myStmt = myConn.createStatement();

    try {
    ResultSet myRs = myStmt.executeQuery("Select * from customar");



        while (myRs.next())
        {
            System.out.println(myRs.getString("sa"));
            System.out.println(myRs.getString("123456"));
        }
    }
    catch (SQLException e)
    {
        System.out.println("Error with query");
      
    }
    }

    catch (SQLException e)
    {
        System.out.println("Error connecting to database");
    }
    }

    catch (ClassNotFoundException | SQLException e)
    {
        System.out.println(e);
    }
}
} 