package com.example.mddeloarhossain.jonakipust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView currentDateText;
    private Button CurrentDateButton, DatePickerButton, GridLayoutButton;
    private DatePicker CurrentDatePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentDateText = findViewById(R.id.currentDateTextViewId);
        CurrentDateButton = findViewById(R.id.currentDateButtonId);
        DatePickerButton = findViewById(R.id.datePickerButtonId);
        GridLayoutButton = findViewById(R.id.gridLayoutButtonId);
        CurrentDatePicker = findViewById(R.id.currentDatePickerId);

        currentDateText.setText(currenDate());

        CurrentDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentDateText.setText(currenDate());
            }
        });
        DatePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),DatePickerActivity.class);
                startActivity(intent);
            }
        });
        GridLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Grid1Activity.class);
                startActivity(intent);
            }
        });
    }

    String currenDate()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current Date : ");
        stringBuilder.append(CurrentDatePicker.getDayOfMonth()+" / ");
        stringBuilder.append((CurrentDatePicker.getMonth()+1)+" / ");
        stringBuilder.append(CurrentDatePicker.getYear());

        return stringBuilder.toString();
    }
}
