package com.sunny.patterns.conduct;

/**
 * @program: StrategyPatterns
 * @description: 鸣叫行为的接口
 * @author: David
 * @create: 2018-07-29 20:49
 **/
public interface QuackBehavior {
    /**
     * 定义铭记的接口，所有子类实现自己的鸣叫行为
     * @param 
     * @return  
     */ 
    public void quack();
}
