package com.example.ashi.cross_code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        res=findViewById(R.id.result);
        Intent i=getIntent();
        boolean[] result=i.getBooleanArrayExtra("result");
        for(int j=0;j<=15;j++)
        {
            String res1=res.getText().toString();
            res.setText(res1+"question "+j+" is "+result[j]+"\n");
        }

    }
}
