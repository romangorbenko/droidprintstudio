package com.example;

/**
 * Created by IntelliJ IDEA.
 * User: frol
 * Date: 13.11.10
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
public class Square {
    private Player player = null;

    public void fill(Player player) {
        this.player = player;
    }

    public boolean isFilled() {
        if (player != null) {
            return true;
        }
        return false;
    }

    public Player getPlayer() {
        return player;
    }
}
