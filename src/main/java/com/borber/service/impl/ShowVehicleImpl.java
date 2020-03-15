package com.borber.service.impl;

import com.borber.model.IVehicle;
import com.borber.service.IShowVehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName ShowVehicleImpl.java
 * @Description TODO
 * @createTime 2020年03月15日 16:42
 */
public class ShowVehicleImpl implements IShowVehicle {
    @Override
    public void show(String kind) {
        if(!"Car".equals(kind)&&!"Bus".equals(kind)&&!"Bike".equals(kind)){
            System.out.println("Nothing!");
            return;
        }
        // 获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-homework1-car.xml");
        // 根据 ID 获取Bean 对象
        IVehicle ive = (IVehicle)ac.getBean(kind);
        ive.roar();
    }
}
