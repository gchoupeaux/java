package com.gchoupeaux;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);


        displayHighScorePosition( "Guillaume", calculateHighScorePosition(highScore));

        // System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 1000, 5, 200);

        // System.out.println("Your final score was " + highScore);

        displayHighScorePosition( "Guillaume", calculateHighScorePosition(highScore));

        displayHighScorePosition( "Joe", calculateHighScorePosition(1000));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 0;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore < 1000 && playerScore >= 500 ){
            position = 2;
        } else if (playerScore < 500 && playerScore >= 100 ){
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}

// void => don't return return anything