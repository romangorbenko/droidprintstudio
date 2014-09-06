package com.example;

/**
 * Created by IntelliJ IDEA.
 * User: frol
 * Date: 11.11.10
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public CharSequence getName() {
        return (CharSequence) name;
    }
}
