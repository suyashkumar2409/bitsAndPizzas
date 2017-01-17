package com.example.suyashkumar.bitsandpizzas;

/**
 * Created by SUYASH KUMAR on 1/17/2017.
 */

public class Pizza {
    private int imgResourceId;
    private String name;

    public static final Pizza[] pizzas = {
        new Pizza(R.drawable.diavolo, "Diavolo"),
        new Pizza(R.drawable.funghi, "Funghi")
    };

    private Pizza(int imgResourceId, String name) {
        this.imgResourceId = imgResourceId;
        this.name = name;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public String getName() {
        return name;
    }
}
