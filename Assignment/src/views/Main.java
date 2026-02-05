/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;
import services.SanPhamService;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SanPhamService service = new SanPhamService();
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi");
            System.out.println("3. Tim");
            System.out.println("4. Xoa");
            System.out.println("5. Cap nhat");
            System.out.println("6. Sap xep ten");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1 ->
                    service.themSanPham();
                case 2 ->
                    service.hienThi();
                case 3 ->
                    service.timSanPham();
                case 4 ->
                    service.xoaSanPham();
                case 5 ->
                    service.capNhatSanPham();
                case 6 ->
                    service.sapXepTen();
            }
        } while (chon != 0);
    }
}
