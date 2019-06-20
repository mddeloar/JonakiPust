package com.example.mddeloarhossain.jonakipust;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class BloodMainActivity extends AppCompatActivity {
    private LinearLayout donors;
    private CardView postCard, aboutUsCard, contactUsCard, feedbackCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_main);

        donors  = findViewById(R.id.donorsId);
        postCard  = findViewById(R.id.postCardViewId);
        aboutUsCard  = findViewById(R.id.aboutUsCardViewId);
        contactUsCard  = findViewById(R.id.contactUsCardViewId);
        feedbackCard  = findViewById(R.id.feedbackCardViewId);
        donors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = (new Intent(getApplicationContext(), BloodDonors1Activity.class));
                startActivity(intent1);
            }
        });
        postCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = (new Intent(getApplicationContext(), BloodPostActivity.class));
                startActivity(intent1);
            }
        });
        aboutUsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = (new Intent(getApplicationContext(), BloodDonorProfile1Activity.class));
                startActivity(intent1);
            }
        });
        contactUsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = (new Intent(getApplicationContext(), ProfileActivity.class));
                startActivity(intent1);
            }
        });
        feedbackCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = (new Intent(getApplicationContext(), FloatingActionButtonActivity.class));
                startActivity(intent1);
            }
        });
    }
}
