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
public class MainSingleton {

    public static void main(String[] args) {

        Gamer player1 = new Gamer("ana");
        Game game = new Game();
        game.start(player1);
        game.play(3);
        game.play(5);
        Gamer player2 = new Gamer("pedro");
        game.start(player2);
    
    }

}
