package com.packages;

public class Employee {
    String name;
    int age;
    int empId;
    int phoneNo;

    public Employee(String name, int age, int empId, int phoneNo) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.phoneNo = phoneNo;
    }

    public Employee() {
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getAllData( ) {
        System.out.print("Name: "+ name + "     ");
        System.out.print("Age: "+age+ "     ");
        System.out.print("Employee ID: "+ empId+ "     ");
        System.out.println("Phone No.: "+ phoneNo);
    }

    static void main() {
        Employee emp1 = new Employee("Deep",23,103,2563);
        Employee emp2 = new Employee("Ayush",24,104,4521);
        Employee emp3 = new Employee("Abhishek",20,105,2151);
        emp1.getAllData();
        emp1.setName("Prakhar");
        emp1.getName();
    }
}
