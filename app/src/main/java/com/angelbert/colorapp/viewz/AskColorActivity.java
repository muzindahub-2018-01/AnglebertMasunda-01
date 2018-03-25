package com.angelbert.colorapp.viewz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.angelbert.colorapp.R;

public class AskColorActivity extends AppCompatActivity {
/*
* This Activity will ask for the users color choice and store it.
* Clicking the Enter button will display users color choice and a quote in the ShowColorActivity.
* TODO:Ask user to input color choice as string instead of integer
* */

    //Declaration of member variables for Layout
    private TextView mAskUser;
    private EditText mFavoriteColor;
    private Button mEnterButton;

    //Field to hold users input color.
    private int mColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_color);

        //Getting intent from DisplayActivity
        Intent intent3 = getIntent();

        //Linking our variables to our Layout Views
        mFavoriteColor = findViewById(R.id.favoriteColor);
        mEnterButton = findViewById(R.id.enterButton);
        mAskUser = findViewById(R.id.askUser);

        //Listening for button click
        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Saving favorite color from user.
                String holder= mFavoriteColor.getText().toString();
                mColor = Integer.parseInt(holder);
                startShowColor();

            }
        });
    }
    //Getter method for our user color
    public int getmColor() {
        return mColor;
    }

    //start ShowColor Activity
    private void startShowColor() {
        Intent intent = new Intent(this, ShowColorActivity.class);
        startActivity(intent);
    }

    //onResume method will reset the selection of the user favorite color
    @Override
    protected void onResume() {
        super.onResume();
        mFavoriteColor.setText("");
    }
}



