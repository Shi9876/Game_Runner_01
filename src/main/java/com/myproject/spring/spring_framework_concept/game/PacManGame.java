package com.myproject.spring.spring_framework_concept.game;

public class PacManGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("PacMan Jump");
    }

    @Override
    public void down() {
        System.out.println("PacMan down");

    }

    @Override
    public void left() {
        System.out.println("PacMan left");

    }

    @Override
    public void right() {
        System.out.println("PacMan right");

    }
}
