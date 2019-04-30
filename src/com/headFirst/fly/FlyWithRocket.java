package com.headFirst.fly;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我虽然不会飞，但是我有火箭！");
    }
}
