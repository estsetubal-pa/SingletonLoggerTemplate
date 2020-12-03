package com.pa.patterns.singleton;

public final class Singleton {

    private static Singleton instance;
    // others attributes
    private int attribute;

    private Singleton(){
        attribute=0;
    }

    //get instance
    public static Singleton getInstance() {
        if(instance== null) instance= new Singleton();
        return instance;
    }

    //other methods

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }
}
