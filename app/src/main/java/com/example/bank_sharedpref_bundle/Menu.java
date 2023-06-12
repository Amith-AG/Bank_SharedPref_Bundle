package com.example.bank_sharedpref_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.db:
                Intent i=new Intent(getApplicationContext(),Depo.class);
                startActivity(i);
                break;
            case R.id.bb:
                Intent j=new Intent(getApplicationContext(),Bal.class);
                startActivity(j);
                break;
            case R.id.lob:
                Intent k=new Intent(getApplicationContext(),Login.class);
                SharedPreferences Pref=getSharedPreferences("db",MODE_PRIVATE);
                SharedPreferences.Editor ed=Pref.edit();
                ed.putBoolean("flag",false);
                ed.apply();
                startActivity(k);
                break;
            case R.id.bub:
                Intent n=new Intent(getApplicationContext(),bun.class);
                n.putExtra("name","amith");
                n.putExtra("age",21);
                startActivity(n);
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button db=findViewById(R.id.db);
        Button bb=findViewById(R.id.bb);
        Button lob=findViewById(R.id.lob);
        Button bub=findViewById(R.id.bub);
        db.setOnClickListener(this);
        bb.setOnClickListener(this);
        lob.setOnClickListener(this);
        bub.setOnClickListener(this);
    }
}