package com.github.gmetal.tictactoe;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    public static final String PLAYER_1_NAME_EXTRA = "player_1_name";
    public static final String PLAYER_2_NAME_EXTRA = "player_2_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Toast.makeText(this,
                       getIntent().getStringExtra(PLAYER_1_NAME_EXTRA) + " / " +
                               getIntent().getStringExtra(PLAYER_2_NAME_EXTRA),
                       Toast.LENGTH_SHORT).show();
    }
}
