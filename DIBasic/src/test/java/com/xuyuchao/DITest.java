package com.xuyuchao;

import com.xuyuchao.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-24-19:05
 * @Description:
 */
public class DITest {
    /**
     * 常量注入
     */
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student1");
        System.out.println(student.getName());
    }

    /**
     * Bean注入
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //外部Bean注入
        Student student1 = (Student) context.getBean("student2");
        //内部Bean注入
        Student student2 = (Student) context.getBean("student3");
        System.out.println("-----------外部Bean注入----------");
        System.out.println(student1.getAddress());
        System.out.println("-----------外部Bean注入----------");
        System.out.println(student2.getAddress());
    }
    /**
     * 数组注入
     */
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student4");
        for(String book : student.getBooks()) {
            System.out.println(book);
        }
    }

    /**
     * List注入
     */
    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student5");
        System.out.println(student.getHobbys());
    }

    /**
     * Map注入
     */
    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student6");
        System.out.println(student.getCard());
    }

    /**
     * Set注入
     */
    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student7");
        System.out.println(student.getGames());
    }

    /**
     * Null注入
     */
    @Test
    public void test7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student8");
        System.out.println(student.getWife());
    }

    /**
     * Properties注入
     */
    @Test
    public void test8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student9");
        System.out.println(student.getInfo());
    }

}
