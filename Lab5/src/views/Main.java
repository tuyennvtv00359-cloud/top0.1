/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;
import services.LaptopService;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        LaptopService service = new LaptopService();
        Scanner sc = new Scanner(System.in);

        service.inputList();

        int choice;
        do {
            System.out.println(" MENU ");
            System.out.println("1. Xuất danh sách");
            System.out.println("2. Xuất theo khoảng giá");
            System.out.println("3. Tìm theo ID hoặc Name");
            System.out.println("4. Cập nhật tên theo ID");
            System.out.println("5. Sắp xếp theo Name");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 ->
                    service.outputList();
                case 2 -> {
                    System.out.print("Nhập min: ");
                    double min = sc.nextDouble();
                    System.out.print("Nhập max: ");
                    double max = sc.nextDouble();
                    service.outputByPrice(min, max);
                }
                case 3 -> {
                    System.out.print("Nhập ID hoặc Name: ");
                    String key = sc.nextLine();
                    service.findByIdOrName(key);
                }
                case 4 -> {
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();
                    service.updateNameById(id, newName);
                }
                case 5 -> {
                    service.sortByName();
                    System.out.println("Đã sắp xếp!");
                }
            }
        } while (choice != 0);
    }
}
