package com.example.eliaschang8.georush2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    private int finalScore;
    private TextView finalScore_textView;
    private TextView finalDisplay;
    private Button playAgain, leaderBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        finalScore_textView = (TextView)findViewById(R.id.textView_finalScore);

        finalScore = MapsActivity.score;

        finalScore_textView.setText("Score: " + finalScore);

        playAgain = (Button)findViewById(R.id.button_playgain);
        leaderBoard = (Button) findViewById(R.id.button_leaderboard);

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FinishActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });


        leaderBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FinishActivity.this, LeaderboardActivity.class);
                i.putExtra("FINAL_SCORE",finalScore);
                startActivity(i);
            }
        });
    }
}
