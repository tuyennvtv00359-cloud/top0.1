/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author admin
 */
public class Student {

    private String studentId;
    private String studentName;
    private String phoneNumber;
    private String emailAddress;
    private int studentAge;

    public Student() {
    }

    public Student(String studentId, String studentName,
                   String phoneNumber, String emailAddress,
                   int studentAge) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.studentAge = studentAge;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void displayStudentInformation() {
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ho ten: " + studentName);
        System.out.println("So dien thoai: " + phoneNumber);
        System.out.println("Email: " + emailAddress);
        System.out.println("Tuoi: " + studentAge);
    }
}