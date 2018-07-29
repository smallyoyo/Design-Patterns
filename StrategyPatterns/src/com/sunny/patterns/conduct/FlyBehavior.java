package com.sunny.patterns.conduct;

/**
 * @program: StrategyPatterns
 * @description: 飞行行为的接口
 * @author: David
 * @create: 2018-07-29 20:49
 **/
public interface FlyBehavior {
    /**
     * 定义飞行接口，所以子类实现自己的飞行行为
     * @param
     * @return
     */
    public void fly();
}
