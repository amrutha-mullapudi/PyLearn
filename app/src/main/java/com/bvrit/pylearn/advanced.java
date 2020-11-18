package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class advanced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        configurebutto1();
        configurebutto2();
        configurebutto3();
        configurebutto4();
        configurebutto5();
        configurebutto01();
        packagess();
        filehandli();
    }

    private void packagess() {
        TextView butto01 = (TextView) findViewById(R.id.PACKAGES);
        butto01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, packages.class));
            }

        });
    }

    private void filehandli() {
        TextView butto01 = (TextView) findViewById(R.id.FILES);
        butto01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, filehand.class));
            }

        });
    }

    private void configurebutto01() {  TextView butto01 = (TextView) findViewById(R.id.ITERATORS);
        butto01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, iterators.class));
            }

        });
    }

    private void configurebutto5() { TextView butto5 = (TextView) findViewById(R.id.GETSET);
        butto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, getters.class));
            }

        });
    }

    private void configurebutto4() { TextView butto4 = (TextView) findViewById(R.id.PROPERTY);
        butto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, property.class));
            }

        });
    }

    private void configurebutto3() { TextView butto3 = (TextView) findViewById(R.id.DECORATORS);
        butto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, decorator.class));
            }

        });
    }

    private void configurebutto2() { TextView butto2 = (TextView) findViewById(R.id.CLOSURE);
        butto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, closure.class));
            }

        });
    }

    private void configurebutto1() { TextView butto1 = (TextView) findViewById(R.id.GENERATORS);
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(advanced.this, generators.class));
            }

        });
    }
}
