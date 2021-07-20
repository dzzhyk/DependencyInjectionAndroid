package com.tencent.larkzhang.example.dagger2.entity;

/**
 * 一辆车
 */
public class Car {

    private final String brand;
    private final Wheel wheel;

    public Car(String brand, Wheel wheel) {
        this.brand = brand;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}
