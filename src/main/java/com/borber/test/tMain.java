package com.borber.test;

import com.borber.service.IShowVehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName main.java
 * @Description TODO
 * @createTime 2020年03月15日 16:51
 */
public class tMain {
    public static void main(String[] args) {
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-homework1-car.xml");
        //根据ID获取Bean
        IShowVehicle isve = (IShowVehicle)ac.getBean("Show");
        System.out.println("Car Bus or Bike?");
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.nextLine();
        isve.show(kind);
    }
}
