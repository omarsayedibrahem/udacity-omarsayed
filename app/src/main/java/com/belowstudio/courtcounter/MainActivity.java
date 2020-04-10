package com.belowstudio.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void t16(View view){
        displayForTeamA( scoreTeamA=scoreTeamA+6);


    }

    public void t13(View view){
        displayForTeamA(scoreTeamA=scoreTeamA+3);


    }

public void t12(View view){
        displayForTeamA(scoreTeamA=scoreTeamA+2);


        }
    public void t11(View view){
        displayForTeamA(scoreTeamA=scoreTeamA+1);


    }
    public void resetBtn(View view){
       scoreTeamA=scoreTeamA-scoreTeamA;
       scoreTeamB=scoreTeamB-scoreTeamB;
       displayForTeamA(scoreTeamA);
       displayForTeamB(scoreTeamB);



    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    public void t26(View view){
        displayForTeamB(scoreTeamB=scoreTeamB+6);


    }
    public void t23(View view){
        displayForTeamB(scoreTeamB=scoreTeamB+3);


    }
    public void t22(View view){
        displayForTeamB(scoreTeamB=scoreTeamB+2);


    }
    public void t21(View view){
        displayForTeamB(scoreTeamB=scoreTeamB+1);


    }
}

