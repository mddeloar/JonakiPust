package com.example.mddeloarhossain.jonakipust;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private CardView bloodCard, contributorsCard, tutionCard, feedbackCard, ambulanceCard, fireServiceCard, aboutUsCard, contactUsCard;
    //Navigation
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bloodCard = findViewById(R.id.bloodCardViewId);
        contributorsCard = findViewById(R.id.contributorsCardViewId);
        tutionCard = findViewById(R.id.tutionCardViewId);
        feedbackCard = findViewById(R.id.feedbackCardViewId);
        ambulanceCard = findViewById(R.id.ambulanceCardViewId);
        fireServiceCard = findViewById(R.id.fireServiceCardViewId);
        aboutUsCard = findViewById(R.id.aboutUsCardViewId);

        bloodCard.setOnClickListener(this);
        contributorsCard.setOnClickListener(this);
        tutionCard.setOnClickListener(this);
        feedbackCard.setOnClickListener(this);
        ambulanceCard.setOnClickListener(this);
        fireServiceCard.setOnClickListener(this);
        aboutUsCard.setOnClickListener(this);

        drawerLayout = findViewById(R.id.drawerId);
        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bloodCardViewId:
                Intent intent = (new Intent(getApplicationContext(), BloodMainActivity.class));
                startActivity(intent);
                break;
            case R.id.contributorsCardViewId:
                Intent intent1 = (new Intent(getApplicationContext(), BloodDonorsActivity.class));
                startActivity(intent1);
                break;
            case R.id.tutionCardViewId:
                Intent intent6 = (new Intent(getApplicationContext(), NavigationDrawerActivity.class));
                startActivity(intent6);

                break;
            case R.id.feedbackCardViewId:
                Intent intent2 = (new Intent(getApplicationContext(), FactsActivity.class));
                startActivity(intent2);
                break;
            case R.id.ambulanceCardViewId:
                Intent intent3 = (new Intent(getApplicationContext(), AmbulanceActivity.class));
                startActivity(intent3);
                break;
            case R.id.fireServiceCardViewId:
                Intent intent4 = (new Intent(getApplicationContext(), FireServiceActivity.class));
                startActivity(intent4);
                break;
            case R.id.aboutUsCardViewId:
                Intent intent5 = (new Intent(getApplicationContext(), LogInActivity.class));
                startActivity(intent5);
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        if(item.getItemId()==R.id.SignInMenuItemId)
        {

            Intent intent = (new Intent(getApplicationContext(), HomeActivity.class));
            Toast.makeText(getApplicationContext(), "Sign In Clicked.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        if(item.getItemId()==R.id.SignUpMenuItemId)
        {

            Intent intent = (new Intent(getApplicationContext(), HomeActivity.class));
            Toast.makeText(getApplicationContext(), "Sign Up Clicked.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent intent;
        if(item.getItemId()==R.id.homeMenuId){
            intent = (new Intent(this, MainActivity.class));
            startActivity(intent);
        }
        if(item.getItemId()==R.id.adminMenuId){
            intent = (new Intent(this, BloodMainActivity.class));
            startActivity(intent);
        }
        return false;
    }



}
