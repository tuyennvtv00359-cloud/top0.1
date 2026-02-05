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
public class SanPhamTieuDung extends SanPham {

    private double giamGia;

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap giam gia: ");
        giamGia = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public double thanhTien() {
        return (donGia * soLuong) - giamGia;
    }
}
