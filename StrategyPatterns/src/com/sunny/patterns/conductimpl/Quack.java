package com.sunny.patterns.conductimpl;

import com.sunny.patterns.conduct.QuackBehavior;

/**
 * @program: StrategyPatterns
 * @description: 呱呱叫
 * @author: David
 * @create: 2018-07-29 20:52
 **/
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
