package com.borber.model.impl;

import com.borber.model.IWork1Account;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName Work1FixedAccoiuntImpl.java
 * @Description TODO
 * @createTime 2020年03月15日 17:12
 */
public class Work1FixedAccoiuntImpl implements IWork1Account {
    /**
     * @title Show
     * @description 显示余额
     * @author BORBER
     * @updateTime 2020/3/15 17:13
     */
    @Override
    public void Show(int money) {
        System.out.println("You are a fixed user, You have $ "+money);
    }
}
