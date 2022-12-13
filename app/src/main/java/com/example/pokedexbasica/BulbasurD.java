package com.example.pokedexbasica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BulbasurD extends AppCompatActivity {
    Button regresa1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbasur_d);
        regresa1=(Button)findViewById(R.id.regresa1);

        regresa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BulbasurD.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

}