package com.angelbert.colorapp.model;


import com.angelbert.colorapp.R;
import com.angelbert.colorapp.viewz.AskColorActivity;

/**
 * Created by ANGLEBERT on 3/21/2018.
 *
 * This class will hold an array of PageRefresh objects with all the colors and quotes.
 * Quotes are accessed from our Quotes object.
 * Colors are accessed from our resources.
 * Elements from the array will be called and used to refresh the ShowColorActivity layout with new information,
 * depending on the users color choice.
 * TODO:Design search code using string color choice .
 * TODO: Use switch statement instead of if statement.
 * TODO: Expand color choices.
 */

public class ColorQuotes {

    //Declaration of PageRefresh Array.
   private PageRefresh[] mPageRefresh;

    //Declaration of MyQuotes object
    private MyQoutes quote = new MyQoutes();

    //Declaration of AskColorActivity object
    public AskColorActivity userColor = new AskColorActivity();

   int coolColor= userColor.getmColor();

   //ColorQuotes constructor will initialize our array.
    public ColorQuotes() {
        mPageRefresh = new PageRefresh[5];

        //Use PageRefresh constructor to initialize our array
        mPageRefresh[0] = new PageRefresh(
                R.color.blue, quote.getBlue()
        );

        mPageRefresh[1] = new PageRefresh(
                R.color.orange, quote.getBlack()
        );

        mPageRefresh[2] = new PageRefresh(
                R.color.pink, quote.getWhite()
        );

        mPageRefresh[3] = new PageRefresh(
                R.color.green, quote.getGreen()
        );

        mPageRefresh[4] = new PageRefresh(
                R.color.red, quote.getRed()
        );

    }

    //Method will choose corresponding color and quote depending on user choice and return PageRefresh object.
    public PageRefresh getColorQuote(int coolColor) {

         if (coolColor == 0) {
             return mPageRefresh[coolColor];
         }

         else if (coolColor == 1){
            return mPageRefresh[coolColor];
        }
        else if (coolColor == 2){
            return mPageRefresh[coolColor];
        }
        if (coolColor == 3){
            return mPageRefresh[coolColor];
        }
        else
            return mPageRefresh[coolColor];
    }
}





