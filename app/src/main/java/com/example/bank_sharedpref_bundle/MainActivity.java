package com.example.bank_sharedpref_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    public static Integer bal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences Pref=getSharedPreferences("db",MODE_PRIVATE);
                Boolean check=Pref.getBoolean("flag",false);
                Intent i;
                if(check)
                {
                    i=new Intent(getApplicationContext(),Menu.class);
                }
                else
                {
                    i=new Intent(getApplicationContext(),Login.class);
                }
                startActivity(i);
                finish();


            }
        },2000);
    }
}