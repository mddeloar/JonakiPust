package com.example.mddeloarhossain.jonakipust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.setTitle("Md. Deloar Hossain");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profile_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        /*if(item.getItemId()==R.id.SignOutMenuItemId)
        {
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent intent = (new Intent(getApplicationContext(), SignIn.class));
            Toast.makeText(getApplicationContext(), "Successfully Sign Out", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }*/

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
}
