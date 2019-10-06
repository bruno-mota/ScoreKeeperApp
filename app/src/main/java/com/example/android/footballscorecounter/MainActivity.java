package com.example.android.footballscorecounter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.NumberFormat;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;
    int foul1 = 0;
    int foul2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void FirstScoreIncrement(View view){
        score1 += 1;
        displayScore1(score1);
    }
    public void SecondScoreIncrement(View view){
        score2 += 1;
        displayScore2(score2);
    }
    public void FirstFoulIncrement(View view){
        foul1 += 1;
        displayFoul1(foul1);
    }
    public void SecondFoulIncrement(View view){
        foul2 += 1;
        displayFoul2(foul2);
    }
    public void reset(View view){
        score1 = 0;
        score2 = 0;
        foul1 = 0;
        foul2 = 0;
        displayScore1(score1);
        displayScore2(score2);
        displayFoul1(foul1);
        displayFoul2(foul2);
    }
    private void displayScore1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score1);
        quantityTextView.setText("" + number);
    }

    private void displayScore2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score2);
        quantityTextView.setText("" + number);
    }
    private void displayFoul1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.foul1);
        quantityTextView.setText("" + number);
    }

    private void displayFoul2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.foul2);
        quantityTextView.setText("" + number);
    }
}
