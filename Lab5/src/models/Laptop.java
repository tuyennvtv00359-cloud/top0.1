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
public class Laptop {

    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

    public Laptop() {
    }

    public Laptop(String id, String name, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        id = sc.nextLine();
        System.out.println("Nhập Tên: ");
        name = sc.nextLine();
        System.out.println("Nhập Loại: ");
        type = sc.nextLine();
        System.out.println("Nhập Giá: ");
        price = sc.nextDouble();
        System.out.println("Nhập SLượng: ");
        quantity = sc.nextInt();
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
