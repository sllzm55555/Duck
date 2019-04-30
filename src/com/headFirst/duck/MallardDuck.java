package com.headFirst.duck;

import com.headFirst.fly.FlyWithWings;
import com.headFirst.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
