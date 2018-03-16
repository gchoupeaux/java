package com.gchoupeaux;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 2);
        System.out.println("new score " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player and no score");
        return 0;
    }

    // 1 inch = 2.54cm and one foot = 12 inches

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >=0 && inches <=12) {
            return 0.3 * feet + (0.3/12) * inches;
        } else {
            return -1;
        }
    }

    public static float calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {
            int feet =  inches/12;
            int left = inches%12;

            calcFeetAndInchesToCentimeters(feet, left);


        } else {
            return -1;
        }
    }



}
