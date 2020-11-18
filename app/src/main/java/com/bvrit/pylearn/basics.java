package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class basics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        configuredatatype();
        configuredvariable();
        configureoperators();
        configureconditional();

    }

    private void configureconditional() {
        TextView buttonn = (TextView) findViewById(R.id.cond);
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(basics.this, conditional.class));
            }
        });
    }

    private void configureoperators() {
        TextView button1 = (TextView) findViewById(R.id.operate);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(basics.this, operators.class));
            }
        });
    }

    private void configuredvariable() {
        TextView button2 = (TextView) findViewById(R.id.variab);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(basics.this, variable_py.class));
            }
        });
    }

    private void configuredatatype() {
        TextView buttonk = (TextView) findViewById(R.id.data_type);
        buttonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(basics.this,datatype_py.class));
            }
        });
    }
}