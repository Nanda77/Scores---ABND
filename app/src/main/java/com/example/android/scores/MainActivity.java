package com.example.android.scores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a_goals = 0;
    int b_goals = 0;
    int a_fouls = 0;
    int b_fouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalByA(View view) {

        a_goals = a_goals + 1;
        displayGoalsForTeamA(a_goals);

    }

    public void foulByA(View view) {

        a_fouls = a_fouls + 1;
        displayFoulsForTeamA(a_fouls);

    }

    public void goalByB(View view) {

        b_goals = b_goals + 1;
        displayGoalsForTeamB(b_goals);

    }

    public void foulByB(View view) {

        b_fouls = b_fouls + 1;
        displayFoulsForTeamB(b_fouls);


    }

    public void reset(View view) {
        a_goals = 0;
        b_goals = 0;
        a_fouls = 0;
        b_fouls = 0;

        displayGoalsForTeamA(a_goals);
        displayFoulsForTeamA(a_fouls);
        displayGoalsForTeamB(b_goals);
        displayFoulsForTeamB(b_fouls);


    }

    public void displayGoalsForTeamA(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.a_goals_view);
        scoreView.setText(String.valueOf(goals));
    }

    public void displayGoalsForTeamB(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.b_goals_view);
        scoreView.setText(String.valueOf(goals));
    }

    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.a_fouls_view);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.b_fouls_view);
        scoreView.setText(String.valueOf(fouls));
    }
}
