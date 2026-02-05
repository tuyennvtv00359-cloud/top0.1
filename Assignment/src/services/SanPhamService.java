/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import models.SanPham;
import models.SanPhamDienTu;
import models.SanPhamTieuDung;

/**
 *
 * @author admin
 */
public class SanPhamService {

    ArrayList<SanPham> danhSach = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public boolean kiemTraMa(String ma) {
        return ma.matches("^SP\\d{3}$");
    }

    public void themSanPham() {

        System.out.println("1. Dien tu");
        System.out.println("2. Tieu dung");
        System.out.print("Chon: ");
        int chon = Integer.parseInt(scanner.nextLine());

        SanPham sp;

        if (chon == 1)
            sp = new SanPhamDienTu();
        else
            sp = new SanPhamTieuDung();

        do {
            System.out.print("Nhap ma SP (SPXXX): ");
            sp.maSanPham = scanner.nextLine();
        } while (!kiemTraMa(sp.maSanPham));

        sp.nhap();
        danhSach.add(sp);
    }

    public void hienThi() {
        for (SanPham sp : danhSach) {
            sp.xuat();
            System.out.println("----------------");
        }
    }

    public void timSanPham() {
        System.out.print("Nhap ma can tim: ");
        String ma = scanner.nextLine();

        for (SanPham sp : danhSach) {
            if (sp.maSanPham.equals(ma)) {
                sp.xuat();
                return;
            }
        }

        System.out.println("Khong tim thay!");
    }

    public void xoaSanPham() {
        System.out.print("Nhap ma can xoa: ");
        String ma = scanner.nextLine();

        danhSach.removeIf(sp -> sp.maSanPham.equals(ma));
    }

    public void capNhatSanPham() {
        System.out.print("Nhap ma can cap nhat: ");
        String ma = scanner.nextLine();

        for (SanPham sp : danhSach) {
            if (sp.maSanPham.equals(ma)) {
                sp.capNhat();
                return;
            }
        }

        System.out.println("Khong tim thay!");
    }

    public void sapXepTen() {
        Collections.sort(danhSach,
                Comparator.comparing(sp -> sp.tenSanPham));
    }
}