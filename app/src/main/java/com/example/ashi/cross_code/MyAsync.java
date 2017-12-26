package com.example.ashi.cross_code;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by ashi on 25/11/17.
 */

class MyAsync extends AsyncTask <String,TextView,Void>{
    Context context;
    TextView mText;
    int response;
    MyAsync(Context context,TextView mText)
    {
        this.context=context;
        this.mText=mText;
    }
    @Override
    protected Void doInBackground(String...  strings) {
        String final_url=strings[0];
        try {
            URL preurl = new URL(final_url);
            HttpURLConnection con = (HttpURLConnection)preurl.openConnection();
            con.setRequestMethod("GET");
             response = con.getResponseCode();
            if (response==200)
            {
                System.out.println("Data Loaded Successfully");
                mText.setText("Submmission succesful");
            }
        }catch (Exception ex)
        {
            Log.i("Exceptiion", ex.toString());
            mText.setText("Unsuccesful Submission");
            mText.setTextColor(0xFFEA0F0F);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        if (response==200)
        {
            mText.setText("Submmission succesful");
        }
        super.onPostExecute(aVoid);
    }
}
