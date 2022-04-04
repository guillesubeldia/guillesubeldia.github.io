package com.solvd.hierarchy;

import java.util.HashMap;
import java.util.Map;

public class Employee extends People {

    private String idCompanyNumber;
    Map<String, String> employeeList = new HashMap<>();

    public Employee() {
        setEmployeeList();
        setCompanyName();
    }

    public void setCompanyName() {
        this.idCompanyNumber = "Argentina Central Office";
    }

    public String getCompanyName() {
        return idCompanyNumber;
    }

    public void setEmployeeList() {
        employeeList.put("Carlos, Tevez", "Accountant");
        employeeList.put("Juan, Riquelme", "Security");
    }

    public Map getEmployeeList() {
        return employeeList;
    }


}
