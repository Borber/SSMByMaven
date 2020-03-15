package com.borber.service.impl;

import com.borber.model.IWork1Account;
import com.borber.service.IWork1AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName Work1AccountServiceImpl.java
 * @Description TODO
 * @createTime 2020年03月15日 17:18
 */
public class Work1AccountServiceImpl implements IWork1AccountService {
    @Override
    public void Show(String kind, int money) {
        if(!"Save".equals(kind)&&!"Fixed".equals(kind)){
            System.out.println("No way!");
            return;
        }
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-homework1-band.xml");
        IWork1Account ia = (IWork1Account)ac.getBean(kind);
        ia.Show(money);
    }
}
