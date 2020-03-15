package com.borber.test;

import com.borber.service.IWork1AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName Work1BandMain.java
 * @Description homework 1 exercise 2
 * @createTime 2020年03月15日 17:21
 */
public class Work1BandMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-homework1-band.xml");
        IWork1AccountService ias = (IWork1AccountService)ac.getBean("Show");
        Scanner sc = new Scanner(System.in);
        System.out.println("Save or Fixed?");
        String kind = sc.nextLine();
        System.out.println("God asks you: how much do you want?");
        int money = sc.nextInt();
        ias.Show(kind,money);
    }
}
