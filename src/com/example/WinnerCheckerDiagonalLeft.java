package com.example;

/**
 * Created by IntelliJ IDEA.
 * User: frol
 * Date: 01.12.10
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */
public class WinnerCheckerDiagonalLeft implements WinnerCheckerInterface {
    private Game game;

    public WinnerCheckerDiagonalLeft(Game game) {
        this.game = game;
    }

    public Player checkWinner() {
        Square[][] field = game.getField();
        Player currPlayer;
        Player lastPlayer = null;
        int successCounter = 1;
        for (int i = 0, len = field.length; i < len; i++) {
            currPlayer = field[i][i].getPlayer();
            if (currPlayer != null) {
                if (lastPlayer == currPlayer) {
                    successCounter++;
                    if (successCounter == len) {
                        return currPlayer;
                    }
                }
            }
            lastPlayer = currPlayer;
        }
        return null;
    }
}
