package com.example.ashi.cross_code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button login;
    EditText name,sapid,otp;
    String e,p,o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.login);
        name=findViewById(R.id.email);
        sapid=findViewById(R.id.password);
        otp=findViewById(R.id.otp);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e = name.getText().toString();
                p = sapid.getText().toString();
                o = otp.getText().toString();
                if (e.equals("") || p.equals("")) {
                    Toast.makeText(Login.this, "Please enter Name and Sapid", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(o.equals("88552277"))
                    {
                        Intent i = new Intent(Login.this, Rules.class);
                        Bundle b = new Bundle();
                        b.putString("name", e);
                        b.putString("sapid", p);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(Login.this, "Please enter Correct otp", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
