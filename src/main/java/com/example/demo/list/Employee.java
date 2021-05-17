package com.example.demo.list;

public class Employee {
    private int empID;
    private String empName;
    private String empDept;
    private Double empIncome;
    private boolean isActive;

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empIncome='" + empIncome + '\'' +
                ", income=" + isActive +
                '}';
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public Double getEmpIncome() {
        return empIncome;
    }

    public void setEmpIncome(Double empIncome) {
        this.empIncome = empIncome;
    }

    public boolean getIncome() {
        return isActive;
    }

    public void setIncome(boolean isActive) {
        this.isActive = isActive;
    }
}
