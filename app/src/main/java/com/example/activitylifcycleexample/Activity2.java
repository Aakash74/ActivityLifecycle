package com.example.activitylifcycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
  TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv2=(TextView) findViewById(R.id.text_View_activity2);
        Toast toast=Toast.makeText(this,"onCreate",Toast.LENGTH_LONG);
          toast.setGravity(Gravity.CENTER,0,0);
          toast.show();

          tv2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent= new Intent(Activity2.this,MainActivity.class);
                  startActivity(intent);
              }
          });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast toast=Toast.makeText(this,"onStart",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast=Toast.makeText(this,"onResume",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast=Toast.makeText(this,"onPause",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast=Toast.makeText(this,"onStop",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast=Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        super.onDestroy();
        Toast toast=Toast.makeText(this,"onRestart",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
