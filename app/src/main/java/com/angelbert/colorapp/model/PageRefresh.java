package com.angelbert.colorapp.model;

/**
 * Created by ANGLEBERT on 3/21/2018.
 *
 * This class contains our display layout structure for the ShowColorActivity.
 * Our display will include user color and a string quote to be displayed on a textView.
 * Our colors will be stored in the color Resources folder and will be referenced by a string name.
 *
 */

public class PageRefresh {

    //Declaration of color and quote fields.
    private int mColorId;
    private String mQuote;
    //Boolean will detect if we are on the last activity
    private boolean mIsFinal = false;

    public boolean isFinal() {
        return mIsFinal;
    }
    //Declaration of constructor
    public PageRefresh() {
    }
    //Declaration of customized constructor to pass on our fields
    public PageRefresh(int colorId, String quote) {
        mColorId = colorId;
        mQuote = quote;
    }


    //Getter and setter methods for mColorId and mQuote fields.
    public int getmColorId() {
        return mColorId;
    }

    public void setmColorId(int mColorId) {
        this.mColorId = mColorId;
    }

    public String getmQuote() {
        return mQuote;
    }

    public void setmQuote(String mQuote) {
        this.mQuote = mQuote;
    }




}
