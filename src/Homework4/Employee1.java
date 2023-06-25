package Homework4;

import package1.Employee;

public class Employee1 {

    public static void main(String[] args) {
        Employee employee = new Employee(20000, "Smith", 1);
        Employee employee2 = new Employee(15000, "Alex", 2);


        System.out.println("Surname: " + employee.getSurname());
        System.out.println("Surname: " + employee2.getSurname());

    }
}

