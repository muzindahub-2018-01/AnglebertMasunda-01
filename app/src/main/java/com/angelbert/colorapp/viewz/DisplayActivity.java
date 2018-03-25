package com.angelbert.colorapp.viewz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.angelbert.colorapp.R;
/*
* This activity will display the users login information.
* Clicking the Proceed button will take user to AskColor Activity.
* */
public class DisplayActivity extends AppCompatActivity {
    //Variable declaration for our layoutScreen2.
    private TextView mDisplay;
    private Button mContinue;
    private String userName;
    public static final String TAG = DisplayActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //Getting our intent from MainActivity and storing it in intent2.
        Intent intent2 = getIntent();
        //Using intent object to get username from MainActivity.
        userName = intent2.getStringExtra("userName");

        //To prevent possible intent errors.
        if (userName == null)
            userName = "Friend";

        Log.d(TAG , userName);

        //Linking our variables to our Welcome Layout Views
        mDisplay = findViewById(R.id.welcomeScreen);
        mContinue = findViewById(R.id.welcomeButton);

        //Display username and some text
        mDisplay.setText("Hello " + userName + ", we have successfully confirmed your username and password. You are now authorized to proceed by clicking the button below. Enjoy...");

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DisplayActivity.this, "Ready...", Toast.LENGTH_LONG).show();
                startAskColor();
            }
        });

    }
    //start AskColor Activity
    private void startAskColor() {
        Intent intent = new Intent(this, AskColorActivity.class);
        startActivity(intent);
    }
}
