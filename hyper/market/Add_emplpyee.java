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
public class Add_emplpyee {
    
    public Add_emplpyee(int emploid, String name, int age, String addres, int phon, int salary, String gender){
        this.employeeid = emploid;
        this.employeename = name;
        this.employeeage = age;
        this.employeeaddres = addres;
        this.employeephon = phon;
        this.employeesalary = salary;
        this.employeegender = gender;
    }
    
    private String employeename;
    private int employeeage;
    private String employeeaddres;
    private int employeephon;
    private int employeesalary;
    private String employeegender;
    private String adminusername;
    private int employeeid ;


    public void setId(int id) {
        this.employeeid = id;
    }

    public int getId() {
        return employeeid;
    }

    public void setAdminusername(String adminusername) {
        this.adminusername = adminusername;
    }

    public String getAdminusername() {
        return adminusername;
    }



    public int getEmployeesalary() {
        return employeesalary;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmployeeaddres() {
        return employeeaddres;
    }

    public String getEmployeegender() {
        return employeegender;
    }

    public int getEmployeeage() {
        return employeeage;
    }

    public int getEmployeephon() {
        return employeephon;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setEmployeeaddres(String employeeaddres) {
        this.employeeaddres = employeeaddres;
    }

    public void setEmployeegender(String employeegender) {
        this.employeegender = employeegender;
    }

    public void setEmployeeage(int employeeage) {
        this.employeeage = employeeage;
    }

    public void setEmployeephon(int employeephon) {
        this.employeephon = employeephon;
    }

    public void setEmployeesalary(int employeesalary) {
        this.employeesalary = employeesalary;
    }

  
    public Add_emplpyee(String name, int age, String addres, int phon, int salary, String gender,String user) {
        this.employeename = name;
        this.employeeage = age;
        this.employeeaddres = addres;
        this.employeephon = phon;
        this.employeesalary = salary;
        this.employeegender = gender;
        this.adminusername = user;

    }
       
    public Add_emplpyee(int idd, String name, int age, String addres, int phon, int salary, String gender,String user ) {
        this.employeeid = idd;
        this.employeename = name;
        this.employeeage = age;
        this.employeeaddres = addres;
        this.employeephon = phon;
        this.employeesalary = salary;
        this.employeegender = gender;
        this.adminusername = user;
    }
      

}
