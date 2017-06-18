package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void score3(View view) {
        scoreTeamA += 3;
        displayForTeamA(3);
    }

    public void score2(View view) {
        scoreTeamA += 2;
        displayForTeamA(2);
    }

    public void score1(View view) {
        scoreTeamA += 1;
        displayForTeamA(1);
    }

    public void score3b(View view) {
        scoreTeamB += 3;
        displayForTeamB(3);
    }

    public void score2b(View view) {
        scoreTeamB += 2;
        displayForTeamB(2);
    }

    public void score1b(View view) {
        scoreTeamB += 1;
        displayForTeamB(1);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
