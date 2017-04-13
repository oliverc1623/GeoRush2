package com.example.eliaschang8.georush2;

/**
 * Created by eliaschang8 on 4/10/17.
 */

public class Player {
    private int score;
    private String name;

    public Player(int score, String name){
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
