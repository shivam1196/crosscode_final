package com.example.ashi.cross_code;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
            final Thread myThread = new Thread()
            {
                @Override
                public void run()
                {

                    try
                    { sleep(1000);
                        Intent intent=new Intent(getApplicationContext(),Login.class);
                        startActivity(intent);
                        finish();

                    }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }

                }
            };
            myThread.start();
        }
    }

