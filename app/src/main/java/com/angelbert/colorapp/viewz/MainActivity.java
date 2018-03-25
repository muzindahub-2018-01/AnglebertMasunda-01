package com.angelbert.colorapp.viewz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.angelbert.colorapp.R;
/*
* This activity will ask the user for a name and dummy password as login information.
 * Clicking the Login button will take user to the DisplayActivity.
* */
public class MainActivity extends AppCompatActivity {
    //Variable declaration for our layout.
    private TextView mAskTextview;
    private EditText mName;
    private EditText mpassWord;
    private Button mlogIn;

    //Variable declaration for mame and password.
    private String nameCase;
    private String passWordCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking our variables to our Layout Views
        mAskTextview = findViewById(R.id.askTextView);
        mName = findViewById(R.id.nameView);
        mpassWord = findViewById(R.id.passWordView);
        mlogIn = findViewById(R.id.loginButton);


        //Listening for a click of our login button.
        mlogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            //What to do when button is clicked...Save name and password then move to the next activity using Intent.
            public void onClick(View view) {
                //Storing username and password.
                nameCase = mName.getText().toString();
                passWordCase = mpassWord.getText().toString();
                Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_LONG).show();

                //Use startTalk method to call intent
                startDisplayActivity();
            }
        });
    }
    //Method declaration of startDisplayActivity() to link to next activity.
    private void startDisplayActivity() {
        //Instance of intent object which takes context and class args in constructor
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("userName", nameCase);
        startActivity(intent);
    }
}
