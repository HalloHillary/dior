package com.tr.tan;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button3= findViewById(R.id.bt_4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FirstActivity.this,FourthActivity.class);
                startActivity(intent1);
            }
        });
        Button button4= findViewById(R.id.bt_5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FirstActivity.this,FifthActivity.class);
                startActivity(intent1);
            }
        });

    }
}
