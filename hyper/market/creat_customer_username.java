/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyper.market;

import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class creat_customer_username {
    private String customer_username;
    private int customer_pass;

    public void setCustomer_username(String customer_username) {
        this.customer_username = customer_username;
    }

    public void setCustomer_pass(int customer_pass) {
        this.customer_pass = customer_pass;
    }

    public String getCustomer_username() {
        return customer_username;
    }

    public int getCustomer_pass() {
        return customer_pass;
    }
    
    public creat_customer_username (String name,int pass){
        this.customer_username = name;
        this.customer_pass = pass;
    }
}
