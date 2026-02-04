/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import models.Employee;

/**
 *
 * @author admin
 */
public class EmployeeService {

    public double calculateTotalSalary(ArrayList<Employee> employeeList) {
        double totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getEmployeeSalary();
        }

        return totalSalary;
    }

    public Employee findEmployeeById(ArrayList<Employee> employeeList, String employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }
}