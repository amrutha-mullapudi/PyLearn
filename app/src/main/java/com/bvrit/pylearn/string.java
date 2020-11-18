package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class string extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        configurebutton26();
        configurebutton27();
        configurebutton29();
        configurebutton28();
    }

    private void configurebutton28() {
        TextView button28 = (TextView) findViewById(R.id.METHODS);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(string.this, stringmethod.class));
            }

        });
    }

    private void configurebutton29() {TextView button29 = (TextView) findViewById(R.id.ESCAPECHARS);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(string.this, escape.class));
            }

        });
    }

    private void configurebutton27() {TextView button27 = (TextView) findViewById(R.id.SLICING);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(string.this, slicing.class));
            }

        });
    }

    private void configurebutton26() {
        TextView button26 = (TextView) findViewById(R.id.LITERALS);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(string.this, strliterals.class));
            }

        });
    }
}
