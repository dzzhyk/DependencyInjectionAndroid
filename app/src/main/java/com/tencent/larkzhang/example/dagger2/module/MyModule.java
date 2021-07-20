package com.tencent.larkzhang.example.dagger2.module;

import com.tencent.larkzhang.example.dagger2.entity.Car;
import com.tencent.larkzhang.example.dagger2.entity.Wheel;

import dagger.Module;
import dagger.Provides;

/**
 * 可以理解为Spring中的Configuration配置类
 * Module提供实例对象注册、组装
 */
@Module
public class MyModule {

    @Provides
    Car privideCar(Wheel myWheel){
        return new Car("Atto", myWheel);
    }

    @Provides
    Wheel privideWheel(){
        return new Wheel(4);
    }
}
