package com.github.gmetal.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mPlayer1Name;
    private EditText mPlayer2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer1Name = findViewById(R.id.player_1_name);
        mPlayer2Name = findViewById(R.id.player_2_name);

        final Button startGameButton = findViewById(R.id.start_game_button);
        startGameButton.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {

        if (v.getId() == R.id.start_game_button) {
            if (mPlayer1Name.getText().length() == 0) {
                Toast.makeText(this, "Please enter the first player's name", Toast.LENGTH_SHORT).show();
            } else if (mPlayer2Name.getText().length() == 0) {
                Toast.makeText(this, "Please enter the second player's name", Toast.LENGTH_SHORT).show();
            } else {
                final Intent gameActivityIntent = new Intent(this, GameActivity.class);
                gameActivityIntent.putExtra(GameActivity.PLAYER_1_NAME_EXTRA, mPlayer1Name.getText().toString());
                gameActivityIntent.putExtra(GameActivity.PLAYER_2_NAME_EXTRA, mPlayer2Name.getText().toString());
                startActivity(gameActivityIntent);
            }
        }
    }
}
