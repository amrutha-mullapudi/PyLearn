package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class datatype_py extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datatype_py);
        configurestring();
        configurenumeric();
        configureboolean();
        configure_inbuiltdata();

    }

    private void configure_inbuiltdata() {
        TextView button37 = (TextView) findViewById(R.id.INBUILT);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(datatype_py.this, inbuilt.class));
            }
        });
    }

    private void configureboolean() {
        TextView button37 = (TextView) findViewById(R.id.BOOLEAN);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(datatype_py.this, booleans.class));
            }
        });
    }

    private void configurenumeric() {
        TextView button37 = (TextView) findViewById(R.id.NUMBER);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(datatype_py.this, numbers.class));
            }
        });
    }

    private void configurestring() {
        TextView button37 = (TextView) findViewById(R.id.STRING);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(datatype_py.this, string.class));
            }
        });
    }

}
