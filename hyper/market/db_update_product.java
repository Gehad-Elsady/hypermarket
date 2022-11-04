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
public class db_update_product {
    Connection conn;
    Statement st;
    int productid;

    public db_update_product() throws SQLException {
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
     public void Update(product_class p){
        try {
                    dbconnection o=new dbconnection();

            this.productid = p.getProductid();
         String sql = "update product set product_name ='"+p.getProductname()+"', product_amount = "+p.getProductamount()+", product_prices= "+p.getProductprice()+",product_expirydate='"+p.getProductexpirdate()+"' where product_id ="+this.productid;
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
