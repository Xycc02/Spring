package com.xuyuchao.Config;

import com.xuyuchao.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-17:54
 * @Description:
 */
//代表这是一个配置类
@Configuration
public class MyConfig {
    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    @Bean
    public Dog dog() {
        return new Dog();
    }
}
