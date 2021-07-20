package com.tencent.larkzhang.example.dagger2.component;

import com.tencent.larkzhang.example.MainActivity;
import com.tencent.larkzhang.example.dagger2.MyService;
import com.tencent.larkzhang.example.dagger2.module.MyModule;

import dagger.Component;

/**
 * 我的组件，真正获取实例对象并使用的地方
 */
@Component(modules = {MyModule.class})
public interface MyComponent {

    /**
     * 固定写法
     * 必须绑定Activity / Fragment
     */
    void inject(MyService myService);
    void inject(MainActivity mainActivity);
}
