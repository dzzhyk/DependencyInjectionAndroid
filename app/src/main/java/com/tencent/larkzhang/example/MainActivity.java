package com.tencent.larkzhang.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tencent.larkzhang.example.dagger2.entity.Car;
import com.tencent.larkzhang.example.dagger2.module.MyModule;

import javax.inject.Inject;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(car);
    }

}