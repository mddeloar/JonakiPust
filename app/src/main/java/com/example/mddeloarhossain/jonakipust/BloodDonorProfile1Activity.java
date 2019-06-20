package com.example.mddeloarhossain.jonakipust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BloodDonorProfile1Activity extends AppCompatActivity {

    private boolean isAboutDonation,  isABoutTution;
    private LinearLayout aboutDonation, aboutTution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donor_profile1);

        aboutDonation = findViewById(R.id.aboutDonationlayuotId);
        aboutTution = findViewById(R.id.aboutTutionlayuotId);

        isAboutDonation = false;
        isABoutTution = true;
        if(isAboutDonation){
            //aboutDonation.setVisibility();//not complete



        }
    }
}
