package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import models.Laptop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class LaptopService {

    private ArrayList<Laptop> list = new ArrayList<>();

    public void inputList() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập laptop thứ: " + (i + 1));
            Laptop lt = new Laptop();
            lt.input();
            list.add(lt);
        }
    }

    public void outputList() {
        for (Laptop lt : list) {
            lt.output();
        }
    }

    public void outputByPrice(double min, double max) {
        for (Laptop lt : list) {
            if (lt.getPrice() >= min && lt.getPrice() <= max) {
                lt.output();
            }
        }
    }

    public void findByIdOrName(String key) {
        boolean found = false;
        for (Laptop lt : list) {
            if (lt.getId().equalsIgnoreCase(key)
                    || lt.getName().equalsIgnoreCase(key)) {
                lt.output();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy!");
        }
    }

    public void updateNameById(String id, String newName) {
        for (Laptop lt : list) {
            if (lt.getId().equalsIgnoreCase(id)) {
                lt.setName(newName);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID!");
    }

    public void sortByName() {
        Collections.sort(list, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }
}
