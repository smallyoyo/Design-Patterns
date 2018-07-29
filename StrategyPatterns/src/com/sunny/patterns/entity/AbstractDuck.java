package com.sunny.patterns.entity;

import com.sunny.patterns.conduct.FlyBehavior;
import com.sunny.patterns.conduct.QuackBehavior;

/**
 * @program: StrategyPatterns
 * @description: 鸭子的超类
 * @author: David
 * @create: 2018-07-29 19:01
 **/
public abstract class AbstractDuck {

    /**
     * 设计原则多用组合，少用继承
     * 将变化的部分抽离出来封装
     * 针对接口编程，不针对具体实现编程
     */
    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public AbstractDuck(){

    }

    /**
     * 描述鸭子如何显示
     * @param 
     * @return
     */ 
    public abstract void display();

    /**
     * 描述鸭子飞的行为
     * @param
     * @return
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 描述鸭子叫的行为
     * @param
     * @return
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 通过set方法我们可以动态的改变鸭子的行为
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
