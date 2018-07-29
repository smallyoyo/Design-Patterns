package com.sunny.patterns.conductimpl;

import com.sunny.patterns.conduct.QuackBehavior;

/**
 * @program: StrategyPatterns
 * @description: 橡皮鸭子吱吱叫
 * @author: David
 * @create: 2018-07-29 21:02
 **/
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
