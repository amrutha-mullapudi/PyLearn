package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loops);
        configurebutton40();
        configurebutton41();
        configurebutton42();
        configurebutton43();
    }

    private void configurebutton43() {
        TextView button43 = (TextView) findViewById(R.id.pass_loop);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loops.this, passed.class));
            }

        });
    }

    private void configurebutton42() {TextView button42 = (TextView) findViewById(R.id.break_con);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loops.this, breakcon.class));
            }

        });
    }

    private void configurebutton41() {TextView button41 = (TextView) findViewById(R.id.fors);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loops.this, fors.class));
            }

        });
    }

    private void configurebutton40() {
        TextView button40 = (TextView) findViewById(R.id.while_loop);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loops.this, whilee.class));
            }

        });
    }
}
