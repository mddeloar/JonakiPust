package com.example.mddeloarhossain.jonakipust;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AmbulanceActivity extends AppCompatActivity {

    private LinearLayout callButton, messageButton;
    private String call="01765436702";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        callButton = findViewById(R.id.callButtonId);
        messageButton = findViewById(R.id.messageButtonId);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call="01765436702";
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                //int CallingNumber = String.toInteger(call);
                Toast.makeText(getApplicationContext(), "You calling Number is:"+call, Toast.LENGTH_SHORT).show();
                callIntent.setData(Uri.parse("tel:"+call));
                if (ActivityCompat.checkSelfPermission(AmbulanceActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    //Toast.makeText(DonorDetails.this, "In if method", Toast.LENGTH_SHORT).show();
                    return;
                }
                //Toast.makeText(DonorDetails.this, "Before startActivity.", Toast.LENGTH_SHORT).show();
                startActivity(callIntent);
            }
        });
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AmbulanceActivity.this);
                builder.setIcon(R.drawable.ic_question);
                builder.setTitle("Do you want to send message ?");
                builder.setMessage("Standard Data Charge Apply!");
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        //call = "01765436702";

                        sendSMS("01765436702");
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                        //Toast.makeText(MainActivity.this, "You can Log In Now", Toast.LENGTH_SHORT).show();
                        //startActivity(intent);
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
    protected void sendSMS(String number) {
        Log.i("Send SMS", "");
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);

        smsIntent.setData(Uri.parse("smsto:"));
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address"  , new String (number));
        smsIntent.putExtra("sms_body"  , "Number Collected From Pust Blood Bank.\n");

        try {
            startActivity(smsIntent);
            finish();
            Log.i("Finished sending SMS...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(AmbulanceActivity.this,
                    "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

}
