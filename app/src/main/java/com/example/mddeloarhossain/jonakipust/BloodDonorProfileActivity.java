package com.example.mddeloarhossain.jonakipust;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.Switch;
import android.widget.TextView;

public class BloodDonorProfileActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView currentDateText;
    private CardView CurrentDateButton;
    private DatePickerDialog datePickerDialog;
    //private DatePicker CurrentDatePicker;
    Switch DonateSwitch, TutionSwitch;
    TextView DonateTextView, TutionTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donor_profile);

        currentDateText = findViewById(R.id.lastDonationDateTextId);
        CurrentDateButton = findViewById(R.id.DonationDateId);
        /*currentDateText.setText(currenDate());
        CurrentDatePicker = findViewById(R.id.currentDatePickerId);*/
        //currentDateText.setText();
        CurrentDateButton.setOnClickListener(this);
        DonateTextView = findViewById(R.id.DonationStatusTextViewId);
        TutionTextView = findViewById(R.id.TutionStatusTextViewId);
        DonateSwitch = findViewById(R.id.DonateSwitchId);
        TutionSwitch = findViewById(R.id.TutionSwitchId);

        DonateSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    DonateTextView.setText(": Can't");
                }else {
                    DonateTextView.setText(": Ready");
                }
            }
        });
        TutionSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    TutionTextView.setText(": Can't");
                }else {
                    TutionTextView.setText(": Ready");
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        DatePicker datePicker = new DatePicker(this);

        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = (datePicker.getMonth())+1;
        int currentYear = datePicker.getYear();
        //currentDateText.setText(currentDay);


        datePickerDialog = new DatePickerDialog(this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

                        //******Must Check if it is future date or not******//
                        currentDateText.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                    }
                },currentYear,currentMonth,currentDay);

        datePickerDialog.show();
    }
    /*String currenDate()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CurrentDatePicker.getDayOfMonth()+" / ");
        stringBuilder.append((CurrentDatePicker.getMonth()+1)+" / ");
        stringBuilder.append(CurrentDatePicker.getYear());

        return stringBuilder.toString();
    }*/
}
