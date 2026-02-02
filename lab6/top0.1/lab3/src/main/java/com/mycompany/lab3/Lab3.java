/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab3 {

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0, count = 0;
        float tb;
        while (true) {
            System.out.print("Nhập vào số nguyên dương: ");
            n = readIntSafe(sc);
            if (n > 0) {
                break;
            }
            System.out.println("Số nguyên dương không hợp lệ");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                tong += i;
                count++;
            }
        }
        tb = (float) tong / count;
        System.out.println("Trung binh tổng các số chia hết cho 3 từ 1 đến " + n + " là: " + tb);
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Hãy nhập vào số nguyên chia hết cho 3 và 5");
            n = readIntSafe(sc);
            if ((n % 3 == 0) && (n % 5 == 0)) {
                break;
            }
            System.out.println("Số bạn nhập vào chưa hợp lệ!");
        }
    }

    private static int readIntSafe(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Giá trị không hợp lệ. Nhập lại: ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        while (true) {
            System.out.print("Nhập số phần tử cho mảng ở bài 3(n > 0): ");
            len = readIntSafe(sc);
            if (len > 0) {
                break;
            }
            System.out.println("Vui lòng nhập n lớn hơn 0.");
        }
        int[] arr = new int[len];
        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Tính tổng các số chia hết cho 3 từ 1 đến n");
            System.out.println("2. Kiểm tra số nhập vào phải chia hết cho 3 và 5");
            System.out.println("3. Nhập vào mảng và xuất");
            System.out.println("4. Xuất ra các phần tử trong mảng có giá trị là chẵn");
            System.out.println("5. Tính tổng các phẩn tử chia hết cho 4");
            System.out.println("6. Tìm vị trí của x trong mảng");
            System.out.println("7. Sắp xếp mảng theo thứ tự giảm dần");
            System.out.println("8. Tìm giá trị lớn nhất trong mảng");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1" -> bai1();

                case "2" -> bai2();

                case "3" -> {
                    System.out.println("Nhập phần tử: ");
                    for (int i = 0; i < len; i++) {
                        System.out.print("Phần tử thứ " + i + " : ");
                        arr[i] = readIntSafe(sc);
                    }
                    System.out.println("Mảng vừa nhập: ");
                    for (int j = 0; j < len; j++) {
                        System.out.println("arr[" + j + "] = " + arr[j]);
                    }
                }

                case "4" -> {
                    System.out.println("Các phần tử chẵn: ");
                    for (int j = 0; j < len; j++) {
                        if (arr[j] % 2 == 0) {
                            System.out.println("arr[" + j + "] = " + arr[j]);
                        }
                    }
                }

                case "5" -> {
                    int tong = 0;
                    for (int i = 0; i < len; i++) {
                        if (arr[i] % 4 == 0) {
                            tong += arr[i];
                        }
                    }
                    System.out.println("Tổng các phẩn tử chia hết cho 4: " + tong);
                }

                case "6" -> {
                    int x,
                            id = 0;
                    boolean found = false;
                    System.out.print("Nhập vào số tự nhiên x : ");
                    x = readIntSafe(sc);
                    for (int i = 0; i < len; i++) {
                        if (arr[i] == x) {
                            found = true;
                            id = i;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Vị trí của " + x + " trong mảng là: arr[" + id + "]");
                    } else {
                        System.out.println("Không tìm thấy " + x + " trong mảng!");
                    }
                }

                case "7" -> {
                    Arrays.sort(arr);
                    System.out.println("Mảng sau khi được sắp xếp lại:");
                    for (int j = 0; j < len; j++) {
                        System.out.println("arr[" + j + "] = " + arr[j]);
                    }
                }

                case "8" -> {
                    int max = arr[0];
                    for (int i = 0; i < len; i++) {
                        if (arr[i] >= max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Giá trị lớn nhất: " + max);
                }

                case "0" -> running = false;
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
        sc.close();
        System.out.println("Kết thúc.");
    }
}
