package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.scorekeeper.R.id.goal_button_team_a;

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
     * Implementing all the button clicks through control flow Case statement.
     */
    public void buttonClick(View view){
        int viewId = view.getId();
        switch(viewId){
            case goal_button_team_a:
                goalsTeamA++;
                displayTeamAGoals(goalsTeamA);
                break;
            case R.id.goal_button_team_b:
                goalsTeamB++;
                displayTeamBGoals(goalsTeamB);
                break;
            case R.id.foul_button_team_a:
                foulsTeamA++;
                displayTeamAFouls(foulsTeamA);
                break;
            case R.id.foul_button_team_b:
                foulsTeamB++;
                displayTeamBFouls(foulsTeamB);
                break;
            case R.id.reset_button:
                goalsTeamA = 0;
                goalsTeamB = 0;
                foulsTeamA = 0;
                foulsTeamB = 0;

                displayTeamAGoals(goalsTeamA);
                displayTeamBGoals(goalsTeamB);
                displayTeamAFouls(foulsTeamA);
                displayTeamBFouls(foulsTeamB);
                break;
        }
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
    public void displayTeamAFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for team B.
     */
    public void displayTeamBFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_score_team_b);
        scoreView.setText(String.valueOf(score));
    }
}
