package com.example.foodvilla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Foodcategory extends AppCompatActivity {
    Toolbar toolbar;
   /* String name[] = {"vikash"};
    CircleMenu circleMenu;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcategory);

        // circleMenu = findViewById(R.id.circlemenu);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //getSupportActionBar().setTitle("Rumbles");

        getSupportActionBar().setDisplayShowTitleEnabled(true);


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        BottomNavigationView bottomNav1 = findViewById(R.id.bottom_navigation1);
        bottomNav1.setOnNavigationItemSelectedListener(navListener1);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Beverages()).commit();
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navigation, menu);
        return true;
    }
*/
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.drink:
                            selectedFragment = new Beverages();
                            break;
                        case R.id.snacks:
                            selectedFragment = new Snacks();
                            break;
                        case R.id.meal:
                            selectedFragment = new Meal();
                            break;
                        case R.id.salad:
                            selectedFragment = new Salad();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    private BottomNavigationView.OnNavigationItemSelectedListener navListener1 =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {

                        case R.id.home:
                            /*selectedFragment = new Snacks();*/
                           // startActivity(new Intent(Foodcategory.this,Dashboard.class));
                            break;

                        case R.id.action_cart:
                           // Toast.makeText(getActivity, "", Toast.LENGTH_SHORT).show();
                            selectedFragment = new Beverages();
                            break;

                        case R.id.help:
                            selectedFragment = new Beverages();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}