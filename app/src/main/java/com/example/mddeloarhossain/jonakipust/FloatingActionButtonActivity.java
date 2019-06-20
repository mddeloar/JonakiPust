package com.example.mddeloarhossain.jonakipust;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class FloatingActionButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        FloatingActionButton fab1 = findViewById(R.id.fab_action1);
        FloatingActionButton fab2 = findViewById(R.id.fab_action2);
        FloatingActionButton fab3 = findViewById(R.id.fab_action3);
        FloatingActionButton fab4 = findViewById(R.id.fab_action4);
        FloatingActionButton fab5 = findViewById(R.id.fab_action5);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("fab 1");
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("fab 2");
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("fab 3");
            }
        });
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("fab 4");
            }
        });
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("fab 5");
            }
        });
    }
    public void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
