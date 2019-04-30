package com.headFirst;

import com.headFirst.duck.Duck;
import com.headFirst.duck.MallardDuck;
import com.headFirst.duck.ModelDuck;
import com.headFirst.fly.FlyWithRocket;

public class test {

    public static void main(String[] args) {
        modelDuck_fly();
        mallardDuck_fly();
    }

    private static void modelDuck_fly(){
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();
    }

    private static void mallardDuck_fly(){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }




}
