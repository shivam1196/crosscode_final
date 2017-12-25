package com.example.ashi.cross_code;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView res;
    String e,p,time;
    boolean[] result;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        counter=0;
        res=findViewById(R.id.result);
        Intent in=getIntent();
        Bundle b= in.getExtras();
        e=b.getString("name");
        p=b.getString("sapid");
        time=b.getString("time");
        result=b.getBooleanArray("result");
        for(int j=0;j<=15;j++)
        {
            if(result[j]==true)
            {
                counter++;
            }
        }
        MyAsync my = new MyAsync(getBaseContext(),res);
        my.execute("http://upesacm.org/crosscode2.php?name="+e+"&sapid="+p+"&time="+time+"&score="+counter+"");
    }
    public void onBackPressed() {
        AlertDialog.Builder b=new AlertDialog.Builder(result.this);
        b.setTitle("End Quiz!");
        b.setMessage("Do you Really want to close the Quiz?");
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent a = new Intent(Intent.ACTION_MAIN);
                a.addCategory(Intent.CATEGORY_HOME);
                a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(a);
            }
        });
        b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        b.show();

    }
}
