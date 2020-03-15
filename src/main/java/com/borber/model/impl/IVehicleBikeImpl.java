package com.borber.model.impl;

import com.borber.model.IVehicle;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName IVehicleBikeImpl.java
 * @Description TODO
 * @createTime 2020年03月15日 16:34
 */
public class IVehicleBikeImpl implements IVehicle {
    @Override
    public void roar() {
        System.out.println("I am a bike");
    }
}
