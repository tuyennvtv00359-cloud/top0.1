/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SanPhamDienTu extends SanPham {

    private String ngayBaoHanh;

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay bao hanh: ");
        ngayBaoHanh = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Bao hanh: " + ngayBaoHanh);
    }

    public String getBaoHanh() {
        return ngayBaoHanh;
    }
}