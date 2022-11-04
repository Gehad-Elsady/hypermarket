/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyper.market;

//import com.sun.org.glassfish.gmbal.*;
import java.sql.*;
import java.sql.*;
import java.sql.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class db_update_employee {
     Connection conn;
    Statement st;
int productid;

    public db_update_employee() {
        
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
    
    public void Update(Add_emplpyee p){
        try {
                    dbconnection o=new dbconnection();

            this.productid = p.getId();
         String sql = "update employees set employee_name ='"+p.getEmployeename()+"', employee_age = "+p.getEmployeeage()+", employee_addres= '"+p.getEmployeeaddres()+"',employee_phoneNumber="+p.getEmployeephon()+",employee_salary="+p.getEmployeesalary()+",gender='"+p.getEmployeegender()+"' where employee_id ="+this.productid;
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
