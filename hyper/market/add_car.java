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
public class add_car {
private int productid;
    DefaultTableModel tableModel = new DefaultTableModel();

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProductid() {
        return productid;
    }
    public add_car(int id) {
        this.productid = id;
    }
    
}
