package com.example.finalprojectmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecipeRisotto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_risotto);

        Button whereToBuyButton = findViewById(R.id.whereToBuyButton);
        whereToBuyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(RecipeRisotto.this, MapFragment.class);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}