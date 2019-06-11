package com.rajab.Overriding;


public class MethodOverridingChild extends MehodOverriding {

    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        MethodOverridingChild m = new MethodOverridingChild();
        m.run();
    }
}
