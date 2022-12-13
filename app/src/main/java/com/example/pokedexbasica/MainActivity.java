package com.example.pokedexbasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button bottonBulbasaur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottonBulbasaur=(Button)findViewById(R.id.bottonBulbasaur);

        bottonBulbasaur.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent i = new Intent(MainActivity.this,BulbasurD.class);
        startActivity(i);
        }
        });

        }

        }