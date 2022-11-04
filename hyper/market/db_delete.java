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
public class db_delete {
Connection conn;
  Statement st;
    public db_delete() {     
     try {
            //Prepare Sql Connection
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    conn = DriverManager.getConnection(dbURL, user, pass);
    st = conn.createStatement();

            // Creating Sql Statement
           
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            //Close
       
    }
    
    //**************     delete report  ************************
    public void reporte_delete (delete p){
        
        try {
         String sql = "delete from reports where report_id ="+p.getRepotid()+" ";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete Product", JOptionPane.INFORMATION_MESSAGE);
     st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //******************     delete product     ********************
    
    public void delete_product (delete p){
        
        try {
            
            //Prepare Sql Connection
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    conn = DriverManager.getConnection(dbURL, user, pass);
    st = conn.createStatement();

            
         String sql = "delete from Product where product_id ="+p.getProductid()+"";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete Product", JOptionPane.INFORMATION_MESSAGE);
     st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    //**********************   delete care  *****************************
    
     public void delete_car (delete p){
        
        try {
            
            //Prepare Sql Connection
           String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    conn = DriverManager.getConnection(dbURL, user, pass);
    st = conn.createStatement();

            
         String sql = "delete from car_product where id ="+p.getCarid()+"";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete Product", JOptionPane.INFORMATION_MESSAGE);
     st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     //************************  delete employee   ***************************
     
     public void delete_employee (delete p){
        
        try {
            
            //Prepare Sql Connection
           String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    conn = DriverManager.getConnection(dbURL, user, pass);
    st = conn.createStatement();
            
         String sql = "delete from employees where employee_id = "+p.getEmployeeid()+"";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete Product", JOptionPane.INFORMATION_MESSAGE);
     st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
}
