package com.example.humanoop;

import android.util.Log;

public class Anna  extends Human{
    private int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);


    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight=weight+2;
        Log.d("Anna","I am eating"+weight+"kg");
    }

    @Override
    public int birthday() {
//        return super.birthday();
        age=age+4;
        Log.d("Anna","Happy birthday,you are now " +age);
        return age;

    }
}

