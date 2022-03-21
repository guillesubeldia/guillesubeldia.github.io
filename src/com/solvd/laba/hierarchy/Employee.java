package com.solvd.laba.hierarchy;

public abstract class Employee extends People{

    private int idCompanyNumber;
    private String fullname;
    public Employee(){

    }
//    public Employee(String firstName, String lastName, int idNumber, int idCompanyNumber) {
//        super(firstName, lastName, idNumber);
//        this.idCompanyNumber = idCompanyNumber;
//    }

    public void setEmployeeName(){
    }

    public String getEmployeeName(String fisrtName, String lastName){
        this.fullname = fisrtName + lastName;
        return fullname;
    }

    public int getIdCompanyNumber() {
        return idCompanyNumber;
    }

    public void setArea(){

    }
    public void getArea(){

    }




}
