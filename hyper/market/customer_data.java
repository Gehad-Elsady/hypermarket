/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyper.market;

/**
 *
 * @author hp
 */
public class customer_data {
private String customername ;
private String customeraddres ;
private int customerphon ;
private int customerage ;
private String customerngender ;
private int customervisa ;
private int customerid ;
private String user ;

    
  
    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public void setCustomeraddres(String customeraddres) {
        this.customeraddres = customeraddres;
    }

    public void setCustomerphon(int customerphon) {
        this.customerphon = customerphon;
    }

    public void setCustomerage(int customerage) {
        this.customerage = customerage;
    }

    public void setCustomerngender(String customerngender) {
        this.customerngender = customerngender;
    }

    public void setCustomervisa(int customervisa) {
        this.customervisa = customervisa;
    }

    public String getCustomername() {
        return customername;
    }

    public String getCustomeraddres() {
        return customeraddres;
    }

    public int getCustomerphon() {
        return customerphon;
    }

    public int getCustomerage() {
        return customerage;
    }

    public String getCustomerngender() {
        return customerngender;
    }

    public int getCustomervisa() {
        return customervisa;
    }

    public customer_data(String name , int age ,int phon,String gender,String addres,String username) {
        this.customername = name;
        this.customerage = age;
        this.customerphon = phon;
        this.customerngender = gender;
        this.customeraddres = addres;
        this.user = username;


                                                        
    }
    public  customer_data(int id,String name, int age,int phon,String addres,String gender) {
        this.customerid = id;
        this.customername = name;
        this.customerage = age;
        this.customerphon = phon;
        this.customeraddres = addres;
        this.customerngender = gender;

    }
     public void update(int id,String name, int age,String addres,int phon,String gender) {
        this.customerid = id;
        this.customername = name;
        this.customerage = age;
        this.customerphon = phon;
        this.customeraddres = addres;
        this.customerngender = gender;

    }
      public  customer_data(){
          
      }
              
}

