package com.example.ashi.cross_code;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rules extends AppCompatActivity {
    Button next;
    String e;
    String p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        Intent in=getIntent();
        Bundle b=in.getExtras();
         e=b.getString("name");
         p=b.getString("sapid");
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Rules.this,MainActivity.class);
                Bundle b=new Bundle();
                b.putString("name",e);
                b.putString("sapid",p);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder b=new AlertDialog.Builder(Rules.this);
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
