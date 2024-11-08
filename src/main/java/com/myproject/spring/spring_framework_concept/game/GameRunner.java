package com.myproject.spring.spring_framework_concept.game;

//Iteration 1:
//1. GameRunner class is tightly coupled whatever the game we are running here.
//2. Like here, it is tightly coupled to  MarioGame.
//3. If it may tightly coupled to SuperContraGame by making change in this GameRunner class.
//4. So how can we solve this? How can we reduce this coupling and make it a little bit loosly coupled.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner{
    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
    this.game = game;
    }

    public void run() {  //run MarioGame
            game.up();    //when playing game might press diff button
            game.down();
            game.left();
            game.right();
    }
}

//Iteration 2:
//Now GameRunner using GamingConsole for running games either Mario or SuperContra without changing in GameRunner class.