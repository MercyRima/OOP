package com.example.humanoop;

import android.util.Log;

public class Human {
    String name;
    int age;
    int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int weight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }
    public void eat(){
        Log.d("Human","am eating food");
    }
    public void sleep(){
        Log.d("Human","zzzzzzzzzz");
    }
    public int sleep(int hours){
        Log.d("Human","am sleeping for "+hours);
        return hours;
    }
    public void speak(String speach){
        Log.d("Human","Hey you");
    }
    public  int birthday(){
        age=age+1;
        return age;
    }
}
