package com.example.finalprojectmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipeArtichokes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_artichokes);

        Button whereToBuyButton = findViewById(R.id.whereToBuyButton);
        whereToBuyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(RecipeArtichokes.this, MapFragment.class);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}