package com.headFirst.duck;

import com.headFirst.fly.FlyNoWay;
import com.headFirst.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }



}
