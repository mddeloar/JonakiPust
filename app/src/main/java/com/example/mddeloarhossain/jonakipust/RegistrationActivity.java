package com.example.mddeloarhossain.jonakipust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private CardView saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        this.setTitle("Registration");

        checkBox = findViewById(R.id.checkboxId);
        saveButton = findViewById(R.id.SaveDonorDataButtonId);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String check;
                if(checkBox.isChecked()){
                    check = "Yes";
                    Toast.makeText(getApplicationContext(),check,Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
