package com.tr.tan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button= findViewById(R.id.bt_1);
        Button button1= findViewById(R.id.bt_2);
        Button button2= findViewById(R.id.bt_3);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent1=new Intent(MainActivity.this,FirstActivity.class);
              startActivity(intent1);
          }
      });
         button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent1=new Intent(MainActivity.this,ScondActivity.class);
              startActivity(intent1);
          }
      });  button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent1=new Intent(MainActivity.this,ThirdActivity.class);
              startActivity(intent1);
          }
      });



    }
}
