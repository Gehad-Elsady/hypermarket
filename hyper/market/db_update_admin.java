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
public class db_update_admin {
   Connection conn;
    Statement st;
    public db_update_admin() {
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
    
    public void updat(updat_adminn p){
        
         try {
                    dbconnection o=new dbconnection();

         String sql = "update admin_login set user_name ='"+p.getNewname()+"', pass = "+p.getNwepass()+" where user_name ='"+p.getOldname()+"'and pass = "+p.getOldpass()+"";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Update Successfully", "update admin", JOptionPane.INFORMATION_MESSAGE);

            //Close
            st.close();
            conn.close();
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
