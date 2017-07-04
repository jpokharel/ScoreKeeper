package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int foulsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method adds the goal score for team A
     */
    public void addGoalsForA(View view) {
        goalsTeamA += 1;
        displayTeamAGoals(goalsTeamA);
    }

    /**
     * This method adds the goal score for team B
     */
    public void addGoalsForB(View view) {
        goalsTeamB += 1;
        displayTeamBGoals(goalsTeamB);
    }

    /**
     * This method adds foul counts for team A
     */
    public void addFoulsForA(View view) {
        foulsTeamA += 1;
        displayteamAFouls(foulsTeamA);
    }

    /**
     * This method adds foul counts for team B
     */
    public void addFoulsForB(View view) {
        foulsTeamB += 1;
        displayteamBFouls(foulsTeamB);
    }

    /**
     * Displays the goal score for team A.
     */
    public void displayTeamAGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goal score for team B.
     */
    public void displayTeamBGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for team A.
     */
    public void displayteamAFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for team B.
     */
    public void displayteamBFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets both goals and fouls for both teams and displays in the UI.
     */
    public void resetScores(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;

        displayTeamAGoals(goalsTeamA);
        displayTeamBGoals(goalsTeamB);
        displayteamAFouls(foulsTeamA);
        displayteamBFouls(foulsTeamB);
    }
}
