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
public class db_product {
    Connection conn;
    Statement st;

    public db_product() throws SQLException {
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
    
     public void Add_Product(product_class p) throws SQLException {
//        String l = "gehad";
        // Creating Sql Statement
        dbconnection o=new dbconnection();

        String sql = "insert into product values ('"+p.getProductname()+ "'," + p.getProductamount()+ "," + p.getProductprice()+ ",'"+p.getProductexpirdate()+"','"+p.getEmployeename()+"','kkkk');";
        st.executeUpdate(sql);
        //st.executeUpdate(aaa);
        JOptionPane.showMessageDialog(null, "Added Successfully", "Add Product", JOptionPane.INFORMATION_MESSAGE);

       
    }
    public void CloseConnection() throws SQLException
    {
        st.close();
        conn.close(); 
    }
}
