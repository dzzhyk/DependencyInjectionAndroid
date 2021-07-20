package com.tencent.larkzhang.example.dagger2;

import com.tencent.larkzhang.example.dagger2.entity.Car;

import javax.inject.Inject;

public class MyService {

    /**
     * 注入car
     */
    @Inject
    Car car;

    public void show(){
        System.out.println("my new car: " + car);
    }

}
