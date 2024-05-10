package com.example.finalprojectmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class FragmentActivity extends AppCompatActivity {

    FrameLayout frameLayout;

    TabLayout layoutTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        Button profileBtn = findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to another layout (Activity) or perform desired action
                Intent intent = new Intent(FragmentActivity.this, UserProfile.class);
                startActivity(intent);
            }
        });

        frameLayout = (FrameLayout) findViewById(R.id.layoutFrame);
        layoutTab = (TabLayout) findViewById(R.id.tabLayout);


        getSupportFragmentManager().beginTransaction().replace(R.id.layoutFrame, new MainFragment())
                .addToBackStack(null)
                .commit();


        layoutTab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()){
                    case 0:
                        fragment = new MainFragment();
                        break;
                    case 1:
                        fragment = new RecipeFragment();
                        break;
                    case 2:
                        fragment = new MapFragment();
                        break;

                }

                getSupportFragmentManager().beginTransaction().replace(R.id.layoutFrame, fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }



            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });
    }

}
