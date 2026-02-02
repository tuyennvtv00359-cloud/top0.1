/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;
import java.util.Scanner;
import models.Cylinder;
import services.CylinderService;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Cylinder> danhSach = new ArrayList<>();
        CylinderService service = new CylinderService();

        int chon;

        do {
            System.out.println("MENU");
            System.out.println("1. Nhập hình trụ");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính tổng thể tích");
            System.out.println("4. Tìm hình trụ lớn nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            chon = sc.nextInt();

            if (chon == 1) {
                System.out.print("Nhập bán kính: ");
                double r = sc.nextDouble();
                sc.nextLine();

                System.out.print("Nhập màu sắc: ");
                String color = sc.nextLine();

                System.out.print("Nhập chiều cao: ");
                double h = sc.nextDouble();

                Cylinder c = new Cylinder(r, color, h);
                danhSach.add(c);

                System.out.println("Đã thêm hình trụ.");
            }

            if (chon == 2) {
                System.out.println("----- DANH SÁCH HÌNH TRỤ -----");
                for (int i = 0; i < danhSach.size(); i++) {
                    Cylinder c = danhSach.get(i);

                    System.out.println("Hình trụ thứ " + (i + 1));
                    System.out.println("Bán kính: " + c.getRadius());
                    System.out.println("Màu sắc: " + c.getColor());
                    System.out.println("Chiều cao: " + c.getHeight());
                    System.out.println("Thể tích: " + c.getVolume());
                    System.out.println("----------------------------");
                }
            }

            if (chon == 3) {
                double tong = service.tinhTongTheTich(danhSach);
                System.out.println("Tổng thể tích các hình trụ:");
                System.out.println(tong);
            }

            if (chon == 4) {
                Cylinder max = service.timTheTichLonNhat(danhSach);
                System.out.println("Hình trụ có thể tích lớn nhất:");
                System.out.println("Bán kính: " + max.getRadius());
                System.out.println("Màu sắc: " + max.getColor());
                System.out.println("Chiều cao: " + max.getHeight());
                System.out.println("Thể tích: " + max.getVolume());
            }

        } while (chon != 0);

        System.out.println("Kết thúc chương trình.");
        sc.close();
    }
}