package com.angelbert.colorapp.viewz;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.angelbert.colorapp.R;
import com.angelbert.colorapp.model.ColorQuotes;
import com.angelbert.colorapp.model.PageRefresh;
/*
* This Activity will display the users color choice in the background and a motivational quote and then ask User to play again.
* Clicking the play again button will take them back to the AskColorActivity.
* TODO: fix logic error.
* */
public class ShowColorActivity extends AppCompatActivity {

    //Declaration of member variables for Layout
    private TextView mDsiplayQuote;
    private ConstraintLayout mDisplayColor;
    private Button mBackButton;

    //Declaration of ColorQuotes object to access our refresher pages with all the quotes and colors.
    private ColorQuotes mColorQuotes = new ColorQuotes();
    //Declaration of AskColorActivity object to access our refresher pages with all the quotes and colors.
    private AskColorActivity color = new AskColorActivity();
    //Declaration of PageRefresher object to hold our array element.
    private PageRefresh page;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_color);

        //Getting our intent from AskColorActivity and storing it in intent4.
        Intent intent4 = getIntent();

        //Linking our variables to our Layout Views
        mDsiplayQuote = findViewById(R.id.showQuote);
        mDisplayColor = findViewById(R.id.showColor);
        mBackButton = findViewById(R.id.backButton);

        loadPage();

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    //loadpage() will load new page to our activity
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void loadPage() {
        page = mColorQuotes.getColorQuote(color.getmColor());

        //Passing page data to our layout
        Drawable drawable = getResources().getDrawable(page.getmColorId());
        mDisplayColor.setBackground(drawable);

        mDsiplayQuote.setText(page.getmQuote());
    }


}
