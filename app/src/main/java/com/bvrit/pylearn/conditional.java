package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class conditional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditional);
        configurebutton37();
        configurebutton38();
        configurebutton39();
    }

    private void configurebutton38() {
        TextView button38 = (TextView ) findViewById(R.id.ELIF);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(conditional.this, if_elif.class));
            }

        });
    }

    private void configurebutton39() {TextView button39 = (TextView ) findViewById(R.id.NESTED);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(conditional.this, nested.class));
            }

        });
    }

    private void configurebutton37() {TextView  button37 = (TextView ) findViewById(R.id.IFELSE);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(conditional.this, if_else.class));
            }

        });
    }
}
