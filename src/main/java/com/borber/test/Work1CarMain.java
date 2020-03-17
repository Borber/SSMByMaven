package com.borber.test;

import com.borber.service.IShowVehicle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName main.java
 * @Description homework 1 exercise 1
 * @createTime 2020年03月15日 16:51
 */
public class Work1CarMain {
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
