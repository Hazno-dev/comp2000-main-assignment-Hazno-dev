package com.example.scoremanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);
    }
    public void g1Click(View view) {
        Intent intents = new Intent(this, LevelSelect.class);
        startActivity(intents);
    }
}