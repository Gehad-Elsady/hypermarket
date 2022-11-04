/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyper.market;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class delete {
   private int row;
   private int repotid;
      private int productid;
   private int rowproduct;
   private int carid;
   private int employeeid;

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public int getCarid() {
        return carid;
    }

    public void setRowproduct(int rowproduct) {
        this.rowproduct = rowproduct;
    }

    public int getRowproduct() {
        return rowproduct;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProductid() {
        return productid;
    }

DefaultTableModel tableModel = new DefaultTableModel();
    public void setRow(int row) {
        this.row = row;
    }

    public void setRepotid(int repotid) {
        this.repotid = repotid;
    }

    public int getRow() {
        return row;
    }

    public int getRepotid() {
        return repotid;
    }
    public delete() {
        
    }
    //*****************  report
    public delete(int id){
      this.repotid = id;  
    }
   // ****************  product
    public void delete_product (int proid ){
        this.productid = proid;
    }
    //******************** product car
    
    public void delete_car(int idcar){
        this.carid = idcar;
    }
    
    //**************  employee
    public void delete_employee(int employeeid){
        this.employeeid = employeeid;
    }
}
