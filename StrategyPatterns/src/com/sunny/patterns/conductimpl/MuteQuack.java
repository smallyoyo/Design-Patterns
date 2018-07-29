package com.sunny.patterns.conductimpl;

import com.sunny.patterns.conduct.QuackBehavior;

/**
 * @program: StrategyPatterns
 * @description: 不会叫
 * @author: David
 * @create: 2018-07-29 21:01
 **/
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
