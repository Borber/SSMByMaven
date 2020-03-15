package com.borber.model.impl;

import com.borber.model.IWork1Account;

/**
 * @author BORBER
 * @version 1.0.0
 * @ClassName iWork1SavingAccountImpl.java
 * @Description TODO
 * @createTime 2020年03月15日 17:05
 */
public class Work1SavingAccountImpl implements IWork1Account {
    /**
     * @title Show
     * @description
     * @author BORBER
     * @updateTime 2020/3/15 17:10
     */
    @Override
    public void Show(int money) {
        System.out.println("You are a saving user, You have $ "+money);
    }
}
