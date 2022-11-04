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
public class emplyee_username {
  private String employee_username;
    private int employee_pass;

    public void setCustomer_username(String customer_username) {
        this.employee_username = customer_username;
    }

    public void setCustomer_pass(int customer_pass) {
        this.employee_pass = customer_pass;
    }

    public String getCustomer_username() {
        return employee_username;
    }

    public int getCustomer_pass() {
        return employee_pass;
    }

    
    public emplyee_username(String name,int pass) {
           this.employee_username = name;
        this.employee_pass = pass;
    }
    
}
