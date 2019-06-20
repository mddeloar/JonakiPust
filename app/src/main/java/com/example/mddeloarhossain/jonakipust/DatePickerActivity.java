package com.example.mddeloarhossain.jonakipust;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView currentDateText;
    private Button CurrentDateButton;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);


        currentDateText = findViewById(R.id.currentDateTextViewId);
        CurrentDateButton = findViewById(R.id.currentDateButtonId);
        //currentDateText.setText();
        CurrentDateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        DatePicker datePicker = new DatePicker(this);

        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = (datePicker.getMonth())+1;
        int currentYear = datePicker.getYear();


        datePickerDialog = new DatePickerDialog(this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

                        currentDateText.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                    }
                },currentYear,currentMonth,currentDay);

        datePickerDialog.show();

    }
}
