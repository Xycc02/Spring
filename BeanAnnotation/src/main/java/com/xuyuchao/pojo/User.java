package com.xuyuchao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-25-17:29
 * @Description:
 *
 *  我们这些注解，就是替代了在配置文件当中配置步骤而已！更加的方便快捷！-->
 *
 *  @Component三个衍生注解
 * 为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。
 *  @Controller：controller层(Web)
 *  @Service：service层
 *  @Repository：dao层
 * 写上这些注解，就相当于将这个类交给Spring管理装配了！
 *
 */
//Bean注解注入,相当于配置文件中 <bean id="user1" class="当前注解的类"/>
//其中名称可以省略,默认值为类名首字母小写,若改变默认名,则在getBean的时候务必要改
@Component("user1")
//singleton：默认的，Spring会采用单例模式创建这个对象。关闭工厂 ，所有的对象都会销毁。
//prototype：多例模式。关闭工厂 ，所有的对象不会销毁。内部的垃圾回收机制会回收
@Scope("singleton")
public class User {
    //可以不用提供set方法，直接在直接名上添加@value(“值”)
    //属性注入,相当于配置文件中 <property name="name" value="徐宇超"/>
    @Value("徐宇超")
    private String name;

    public void info() {
        System.out.println("User->info()");
    }

    public String getName() {
        return name;
    }


}
