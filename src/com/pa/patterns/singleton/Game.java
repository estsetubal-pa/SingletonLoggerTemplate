/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.patterns.singleton;

/**
 *
 * @author patricia.macedo
 */
public class Game {

    private Gammer gammer;
    private int total;

    public Game() {
    }

    public void start(Gammer gammer) {
        this.gammer = gammer;
        this.total=0;
        System.out.println("game start");

    }

    public void play(int value) {
        System.out.println("play " + value);
        if(total%5==0)
            total=0;
        else
            total++;
    }
}
