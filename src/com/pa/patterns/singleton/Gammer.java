/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.patterns.singleton;

import java.sql.SQLOutput;

/**
 *
 * @author patricia.macedo
 */
public class Gammer {

    private String name;
    private int countGames;


    public Gammer(String name) {
        this.name=name;
        this.countGames = 0;
        System.out.println("new Gammer - " + name);
}
    public void incGamesCount() {
        this.countGames++;
        System.out.println("Gammer " + name + " another game ");
    }
}