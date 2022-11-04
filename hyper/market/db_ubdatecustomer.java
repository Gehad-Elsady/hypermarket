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
public class db_ubdatecustomer {
 Connection conn;
    Statement st;
int customerid;
    public db_ubdatecustomer() {
          try {
            //Prepare Sql Connection
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Hyper_Market_System;";
    String user = "sa";
    String pass = "123456";
    conn = DriverManager.getConnection(dbURL, user, pass);
    st = conn.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void Update(customer_data p){
        try {
                    dbconnection o=new dbconnection();

            this.customerid = p.getCustomerid();
         String sql = "update customar set customar_name ='"+p.getCustomername()+"', customar_age = "+p.getCustomerage()+", custromar_phoneNumpere= '"+p.getCustomerphon()+"',gender='"+p.getCustomerngender()+"',customar_addres='"+p.getCustomeraddres()+"' where customar_id ="+this.customerid;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Edited Successfully", "Edit Product", JOptionPane.INFORMATION_MESSAGE);

            //Close
            st.close();
            conn.close();
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
