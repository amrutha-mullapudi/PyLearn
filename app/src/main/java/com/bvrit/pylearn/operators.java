package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class operators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
        configurebutton30();
        configurebutton31();
        configurebutton32();
        configurebutton33();
        configurebutton34();
        configurebutton35();
        configurebutton36();
    }

    private void configurebutton36() {
        TextView button36 = (TextView) findViewById(R.id.arithmeticsss);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(operators.this, arithmetic.class));
            }

        });
    }

    private void configurebutton35() { TextView button37 = (TextView) findViewById(R.id.logic);
        button37.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(operators.this, logical.class));
        }

    });
    }

    private void configurebutton34() {
        TextView button37 = (TextView) findViewById(R.id.iden);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(operators.this, identitiy.class));
            }
        });
    }

    private void configurebutton33() { TextView button37 = (TextView) findViewById(R.id.compa);
            button37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(operators.this, comparison.class));
                }

        });
    }

    private void configurebutton32() {
        TextView button37 = (TextView) findViewById(R.id.bitw);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(operators.this, bitwise.class));
            }

        });
    }

    private void configurebutton31() {TextView button31 = (TextView) findViewById(R.id.assignnn);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(operators.this, assignment.class));
            }

        });
    }

    private void configurebutton30() {TextView button30 = (TextView) findViewById(R.id.member);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(operators.this, member.class));
            }

        });
    }
}
