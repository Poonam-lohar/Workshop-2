package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyMain {
    ArrayList<Company> arraylist = new ArrayList<Company>();
    Scanner sc = new Scanner(System.in);

    public void addDetails() {

        Company details = new Company();

        System.out.println("Enter the Employee Name: ");
        details.setEmployeeName(sc.next());
        System.out.println("Enter city: ");
        details.setCity(sc.next());
        System.out.println("Enter state: ");
        details.setState(sc.next());
        System.out.println("Enter Department: ");
        details.setDepartment(sc.next());
        System.out.println("enter Age: ");
        details.setAge(sc.nextInt());
        System.out.println("Enter Phonenumber: ");
        details.setPhoneNumber(sc.next());
        arraylist.add(details);
    }

    public void display() {
        System.out.println(arraylist);
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Company.....");
        CompanyMain details = new CompanyMain();
        details.addDetails();
        details.display();
    }
}









