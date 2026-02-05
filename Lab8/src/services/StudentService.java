/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.InputMismatchException;
import java.util.Scanner;
import models.Student;

/**
 *
 * @author admin
 */
public class StudentService {

    public String removeSpacesAndUppercaseName(String fullName) {
        String processedName = fullName.trim();
        processedName = processedName.toUpperCase();
        return processedName;
    }

    public int countCharactersOfName(String fullName) {
        return fullName.trim().length();
    }

    public boolean validateStudentId(String studentId) {
        return studentId.matches("^SV\\d{3}$");
    }

    public boolean validateStudentName(String studentName) {
        return studentName.matches("^[a-zA-Z\\s]+$");
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^0\\d{9}$");
    }

    public boolean validateEmailAddress(String emailAddress) {
        return emailAddress.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public int inputStudentAge() {

        Scanner scanner = new Scanner(System.in);
        int studentAge;

        while (true) {
            try {
                System.out.print("Nhap tuoi sinh vien: ");
                studentAge = scanner.nextInt();

                if (studentAge <= 0) {
                    throw new Exception("Tuoi phai lon hon 0");
                }

                return studentAge;

            } catch (InputMismatchException exception) {
                System.out.println("Ban phai nhap so nguyen!");
                scanner.nextLine();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("Ket thuc qua trinh nhap du lieu");
            }
        }
    }

    public Student createStudentObject(String studentId,
                                       String studentName,
                                       String phoneNumber,
                                       String emailAddress,
                                       int studentAge) {

        return new Student(studentId, studentName,
                phoneNumber, emailAddress, studentAge);
    }
}