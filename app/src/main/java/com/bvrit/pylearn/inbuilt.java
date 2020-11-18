package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class inbuilt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbuilt);
        configurelist();
        configuretuple();
        configureset();
        configuredict();
        configuremanipulation();
    }

    private void configuremanipulation() {
        TextView button43 = (TextView) findViewById(R.id.manipulate2);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inbuilt.this, manip.class));
            }

        });
    }

    private void configuredict() {
        TextView button43 = (TextView) findViewById(R.id.dict2);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inbuilt.this, dict.class));
            }

        });
    }

    private void configureset() {
        TextView button43 = (TextView) findViewById(R.id.set2);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inbuilt.this, sets.class));
            }

        });
    }

    private void configuretuple() {
        TextView button43 = (TextView) findViewById(R.id.Tuple2);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inbuilt.this, tuple.class));
            }

        });
    }

    private void configurelist() {
        TextView button43 = (TextView) findViewById(R.id.list2);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inbuilt.this, list.class));
            }

        });
    }
}