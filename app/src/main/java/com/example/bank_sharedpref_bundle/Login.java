package com.example.bank_sharedpref_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText ue,pe;
    Button lb;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ue=findViewById(R.id.ue);
        pe=findViewById(R.id.pe);
        lb=findViewById(R.id.lb);
        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=ue.getText().toString();
                String p=pe.getText().toString();
                try {
                    if (a.equals("admin")&&p.equals("1234"))
                    {
                        i=new Intent(Login.this,Menu.class);
                        SharedPreferences Pref=getSharedPreferences("db",MODE_PRIVATE);
                        SharedPreferences.Editor ed= Pref.edit();
                        ed.putBoolean("flag",true);
                        ed.apply();
                        Thread.sleep(2000);
                        Toast.makeText(Login.this, "succesfully logged in", Toast.LENGTH_SHORT).show();
                        startActivity(i);

                    }
                    else
                    {
                        Toast.makeText(Login.this, "Invalid data", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (NullPointerException|InterruptedException e)
                {
                    Toast.makeText(Login.this, "Invalid data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}