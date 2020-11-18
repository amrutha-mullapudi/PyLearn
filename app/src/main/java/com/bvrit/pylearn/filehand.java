package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class filehand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filehand);
        configurebutto01();
        configurebutto2();
        configurebutto1();
    }

    private void configurebutto1() { TextView butto1 = (TextView ) findViewById(R.id.MODES);
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(filehand.this, filemo.class));
            }

        });
    }

    private void configurebutto2() {  TextView  butto2 = (TextView ) findViewById(R.id.METHODS);
        butto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(filehand.this, fileme.class));
            }

        });
    }

    private void configurebutto01() {  TextView  butto01 = (TextView ) findViewById(R.id.OPERATIONS);
        butto01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(filehand.this, fileop.class));
            }

        });
    }
}
