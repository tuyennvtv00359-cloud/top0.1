/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;
import models.Student;
import services.StudentService;

/**
 *
 * @author admin
 */
public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.print("Nhap ho ten ban dau: ");
        String fullName = scanner.nextLine();

        String processedName =
                studentService.removeSpacesAndUppercaseName(fullName);

        int characterCount =
                studentService.countCharactersOfName(fullName);

        System.out.println("Ten sau khi xu ly: " + processedName);
        System.out.println("So ky tu: " + characterCount);

        String studentId;
        do {
            System.out.print("Nhap ma sinh vien: ");
            studentId = scanner.nextLine();

            if (!studentService.validateStudentId(studentId)) {
                System.out.println("Ma sinh vien khong hop le!");
            }

        } while (!studentService.validateStudentId(studentId));

        String studentName;
        do {
            System.out.print("Nhap ho ten sinh vien: ");
            studentName = scanner.nextLine();

            if (!studentService.validateStudentName(studentName)) {
                System.out.println("Ten khong hop le!");
            }

        } while (!studentService.validateStudentName(studentName));

        String phoneNumber;
        do {
            System.out.print("Nhap so dien thoai: ");
            phoneNumber = scanner.nextLine();

            if (!studentService.validatePhoneNumber(phoneNumber)) {
                System.out.println("So dien thoai khong hop le!");
            }

        } while (!studentService.validatePhoneNumber(phoneNumber));

        String emailAddress;
        do {
            System.out.print("Nhap email: ");
            emailAddress = scanner.nextLine();

            if (!studentService.validateEmailAddress(emailAddress)) {
                System.out.println("Email khong hop le!");
            }

        } while (!studentService.validateEmailAddress(emailAddress));

        int studentAge = studentService.inputStudentAge();

        Student student =
                    studentService.createStudentObject(
                        studentId,
                        studentName,
                        phoneNumber,
                        emailAddress,
                        studentAge);

        System.out.println("\nThong tin sinh vien:");
        student.displayStudentInformation();
    }
}