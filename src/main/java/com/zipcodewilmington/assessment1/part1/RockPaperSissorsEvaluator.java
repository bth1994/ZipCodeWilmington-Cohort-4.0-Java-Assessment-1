package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public static String getWinningMove(String handSign) {
        if(handSign.equals("rock")) {
            return PAPER;
        } else if (handSign.equals("paper")) {
            return SCISSOR;
        } else {
            return ROCK;
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public static String getLosingMove(String handSign) {
        if(handSign.equals("rock")) {
            return SCISSOR;
        } else if (handSign.equals("paper")) {
            return ROCK;
        } else {
            return PAPER;
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "Tied!";
        } else if(RockPaperSissorsEvaluator.getLosingMove(handSignOfPlayer1) == handSignOfPlayer2){
            return handSignOfPlayer2;
        } else {
            return handSignOfPlayer1;
        }
    }
}
