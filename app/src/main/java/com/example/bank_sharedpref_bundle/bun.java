package com.example.bank_sharedpref_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class bun extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bun);
        i=getIntent();
        String name=i.getStringExtra("name");
        Integer age=i.getIntExtra("age",0);
        TextView t1=findViewById(R.id.t1);
        t1.setText("my name is "+name+" and im "+age+" years old");
    }
}