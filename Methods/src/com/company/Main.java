package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Warner", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Smith", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Michael", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Chris", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Kohli", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Lara", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Dev", position);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table!!");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if(playerScore >= 1000){
//            return 1;
//        }else if(playerScore >= 500){
//            return 2;
//        }else if(playerScore >= 100){
//            return 3;
//        }else{
//            return 4;
//        }

        int position = 4;       // assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

}
