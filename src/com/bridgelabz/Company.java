package com.bridgelabz;

/*
Create Companies -> Create Employees with details(name, age, phoneNumber,city,state, department)

 */
public class Company {

    String employeeName, city, state, department, phoneNumber;
    int age;

    /*constructor
     */
    public Company() {
        this.employeeName = employeeName;
        this.city = city;
        this.state = state;
        this.department = department;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Company{" +
                "employee name='" + employeeName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                ", age='" + age + '\'' +
                ", phoneNo=" + phoneNumber + '}';
    }
}
