package com.example.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class xo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xodraw);

    }
    // 0 = x, 1 = o
    int activePlayer = 0;
    boolean gameIsActive = true;

    // 2 unplayed
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        // get the current Image View (counter tag)
        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        //if the space is empty(is 2) and the game is not over
        if (gameState[tappedCounter] == 2 && gameIsActive) {
            //set the current player
            gameState[tappedCounter] = activePlayer;
            if (activePlayer == 0) {
                // setImageResource for counter as x
                counter.setImageResource(R.drawable.x);
                // change the player's turn
                activePlayer = 1;
            } else {
                // setImageResource for counter as zero
                counter.setImageResource(R.drawable.o);
                activePlayer = 0;
            }
            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2) {
                    // Someone has won!
                    gameIsActive = false;
                    String winner = "Player1 -> 0";

                    if (gameState[winningPosition[0]] == 0) {
                        winner = "Player2 -> x";
                    }
                    // Make a toast with the messaje winner + " has won!"
                    findViewById(R.id.linearLayout).setVisibility(View.VISIBLE);
                    TextView txt=(TextView)findViewById(R.id.textView);
                    String temp=winner + " has won!";
                    txt.setText(temp);
                } else {
                    boolean gameIsOver = true;

                    for (int counterState : gameState) {
                        if (counterState == 2)
                            gameIsOver = false;
                    }
                    if (gameIsOver) {
                        // Make a toast with the messaje "It's a draw!"
                        Toast.makeText(xo.this, "It's a draw!", Toast.LENGTH_LONG).show();
                        findViewById(R.id.linearLayout).setVisibility(View.VISIBLE);
                        TextView txt=(TextView)findViewById(R.id.textView);
                        txt.setText("It's a draw!");
                    }
                }
            }
        }
    }

    public void replay(View view){
        Intent intent = new Intent(this, xo.class);
        startActivity(intent);
    }
}
