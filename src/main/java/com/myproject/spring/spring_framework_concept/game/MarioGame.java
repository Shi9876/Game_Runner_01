package com.myproject.spring.spring_framework_concept.game;  //subpackage of main package

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
    //definitions of what should happen when we click on these four buttons.

    public void up() {                  //user presses up button on gaming console the mario
        System.out.println("jump");       // game prints up on the gaming console
    }

    public void down() {
        System.out.println("down into a hole");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("accelerated");
    }
}
