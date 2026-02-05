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
public class SanPham {

    public String maSanPham;
    public String tenSanPham;
    protected double donGia;
    protected int soLuong;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham,
                   double donGia, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        tenSanPham = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(scanner.nextLine());
    }

    public void xuat() {
        System.out.println("Ma SP: " + maSanPham);
        System.out.println("Ten SP: " + tenSanPham);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + thanhTien());
    }

    public double thanhTien() {
        return donGia * soLuong;
    }

    public void capNhat() {
        nhap();
    }
}