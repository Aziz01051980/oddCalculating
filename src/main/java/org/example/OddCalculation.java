package org.example;

import java.util.ArrayList;

public class OddCalculation {

//    Creating an automated tool, which calculates the odd against the perfomance of the two teams.
//    Tool calculate and gives the possibility of winning.

    public static void oddsCalculation() {

        double givenOdds = 0.00;

        ArrayList<Double> expectedGoals = new ArrayList<>();
        expectedGoals.add(0.00);
        expectedGoals.add(0.00);
        expectedGoals.add(0.00);
        expectedGoals.add(0.00);
        expectedGoals.add(0.00);
        double expectedGoalsTotal = 0;
        double expectedGoalsAverage = 0;
        for (int k = 0; k < expectedGoals.size(); k++) {
            expectedGoalsTotal += expectedGoals.get(k);
            expectedGoalsAverage = expectedGoalsTotal / expectedGoals.size();
        }

        ArrayList<Double> goals = new ArrayList<>();
        goals.add(0.0);
        goals.add(0.0);
        goals.add(0.0);
        goals.add(0.0);
        goals.add(0.0);
        double goalsTotal = 0;
        double goalsAverage = 0;
        for (int k = 0; k < goals.size(); k++) {
            goalsTotal += goals.get(k);
            goalsAverage = goalsTotal / goals.size();
        }

        ArrayList<Double> expectedGoals1 = new ArrayList<>();
        expectedGoals1.add(0.00);
        expectedGoals1.add(0.00);
        expectedGoals1.add(0.00);
        expectedGoals1.add(0.00);
        expectedGoals1.add(0.00);
        double expectedGoalsTotal1 = 0;
        double expectedGoalsAverage1 = 0;
        for (int k = 0; k < expectedGoals1.size(); k++) {
            expectedGoalsTotal1 += expectedGoals1.get(k);
            expectedGoalsAverage1 = expectedGoalsTotal1 / expectedGoals1.size();
        }

        ArrayList<Double> goals1 = new ArrayList<>();
        goals1.add(0.0);
        goals1.add(0.0);
        goals1.add(0.0);
        goals1.add(0.0);
        goals1.add(0.0);
        double goalsTotal1 = 0;
        double goalsAverage1 = 0;
        for (int k = 0; k < goals1.size(); k++) {
            goalsTotal1 += goals1.get(k);
            goalsAverage1 = goalsTotal1 / goals.size();
        }

        double sumOfGoalsAverage = goalsAverage + goalsAverage1;
        double sumOfExpectedGoalsAverage = expectedGoalsAverage + expectedGoalsAverage1;


        System.out.println("The probability of the goal according to expectations is " + sumOfExpectedGoalsAverage / givenOdds);
        System.out.println("The probability of the goal according to goals " + sumOfGoalsAverage / givenOdds);
    }
}
