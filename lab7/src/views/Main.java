/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;
import java.util.Scanner;
import models.Employee;
import services.EmployeeService;

/**
 *
 * @author admin
 */
public class Main {

    private ArrayList<Employee> employeeList;
    private EmployeeService employeeService;
    private Scanner scanner;

    public Main() {
        employeeList = new ArrayList<Employee>();
        employeeService = new EmployeeService();
        scanner = new Scanner(System.in);
    }

    public void startProgram() {
        int userChoice;

        do {
            showMenu();
            userChoice = Integer.parseInt(scanner.nextLine());

            if (userChoice == 1) {
                addEmployee();
            } else if (userChoice == 2) {
                displayEmployeeList();
            } else if (userChoice == 3) {
                displayTotalSalary();
            } else if (userChoice == 4) {
                searchEmployeeById();
            } else if (userChoice == 0) {
                System.out.println("Chương trình đã kết thúc.");
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (userChoice != 0);
    }

    private void showMenu() {
        System.out.println("\n==========  ==========");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Hiển thị danh sách nhân viên");
        System.out.println("3. Tính tổng lương");
        System.out.println("4. Tìm nhân viên theo mã");
        System.out.println("0. Thoát chương trình");
        System.out.print("Nhập lựa chọn: ");
    }

    private void addEmployee() {
        System.out.print("Nhập mã nhân viên: ");
        String employeeId = scanner.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        String employeeName = scanner.nextLine();

        System.out.print("Nhập lương nhân viên: ");
        double employeeSalary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(employeeId, employeeName, employeeSalary);
        employeeList.add(employee);

        System.out.println("✔ Thêm nhân viên thành công.");
    }

    private void displayEmployeeList() {
        System.out.println("\n----- DANH SÁCH NHÂN VIÊN -----");

        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return;
        }

        for (Employee employee : employeeList) {
            System.out.println(
                    "Mã: " + employee.getEmployeeId()
                    + " | Tên: " + employee.getEmployeeName()
                    + " | Lương: " + employee.getEmployeeSalary()
            );
        }
    }

    private void displayTotalSalary() {
        double totalSalary = employeeService.calculateTotalSalary(employeeList);
        System.out.println(" Tổng lương tất cả nhân viên: " + totalSalary);
    }

    private void searchEmployeeById() {
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String searchId = scanner.nextLine();

        Employee employee = employeeService.findEmployeeById(employeeList, searchId);

        if (employee == null) {
            System.out.println(" Không tìm thấy nhân viên.");
        } else {
            System.out.println(" Nhân viên tìm thấy:");
            System.out.println(
                    "Mã: " + employee.getEmployeeId()
                    + " | Tên: " + employee.getEmployeeName()
                    + " | Lương: " + employee.getEmployeeSalary()
            );
        }
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.startProgram();
    }
}