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

    private Gamer gamer;
    private int total;

    public Game() {
    }

    public void start(Gamer gamer) {
        this.gamer = gamer;
        this.total=0;
        gamer.incGamesCount();
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
