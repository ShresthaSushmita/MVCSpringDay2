package com.dto;

public class EmployeeDTO {
    int employeeId;
    String employeeName;
    String emailId;
    String phone_number;
    int salary;
    String password;

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(int employeeId, String employeeName, String emailId, String phone_number, int salary, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.emailId = emailId;
        this.phone_number = phone_number;
        this.salary = salary;
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                '}';
    }
}
