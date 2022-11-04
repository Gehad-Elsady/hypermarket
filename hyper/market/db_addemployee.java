/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyper.market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class db_addemployee {
    
     Connection conn;
    Statement st;
    public db_addemployee() throws SQLException {
        try {
String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    conn = DriverManager.getConnection(dbURL, user, pass);
    st = conn.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Addemployee(Add_emplpyee p) throws SQLException {
        // Creating Sql Statement
        dbconnection o=new dbconnection();
        String sql = "insert into employees values ('" + p.getEmployeename() + "'," + p.getEmployeeage() + ",'" + p.getEmployeeaddres() + "','" + p.getEmployeephon() + "','" + p.getEmployeesalary() + "','" + p.getEmployeegender() + "','"+p.getAdminusername()+"');";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add employee", JOptionPane.INFORMATION_MESSAGE);

       
    }
    public void CloseConnection() throws SQLException
    {
        st.close();
        conn.close(); 
    }
public static void main(String[] args) {
//         TODO code application logic here
//        
//        start_page m = new start_page();
//        m.setLocation(475, 200);
//        m.setVisible(true);
//       
    }}
    
