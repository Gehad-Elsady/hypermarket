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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class db_add_car {
Connection conn;
  Statement st;
      DefaultTableModel tableModel = new DefaultTableModel();

    public db_add_car() {
        
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
    public void add (add_car p){
        try{
                    dbconnection o=new dbconnection();
//         String sql = "INSERT INTO car_product SELECT product_name,product_prices,product_expirydate FROM product  WHERE product_id="+p.getProductid();
            String sql = "INSERT INTO car_product SELECT product_name,product_prices,product_expirydate FROM product  WHERE product_id="+p.getProductid()+" UPDATE product SET product_amount = product_amount-1 WHERE product_id="+p.getProductid()+";";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Add Successfully", "Add Product", JOptionPane.INFORMATION_MESSAGE);

            //Close
            st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
