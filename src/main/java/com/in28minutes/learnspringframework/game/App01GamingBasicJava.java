package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.game.GamerRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        
        var gameRunner = new GamerRunner(game);
        
        gameRunner.run();
    }

}
