package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class object extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);
        configurebuttona();
        configurebuttonb();
        configurebuttonc();
        configurebuttond();
        configurebuttone();
        configurebuttonf();
        configurebuttong();

    }

    private void configurebuttong() { TextView buttong = (TextView) findViewById(R.id.overload);
        buttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, opera.class));
            }
        });
    }

    private void configurebuttonf() { TextView buttonf = (TextView) findViewById(R.id.override);
        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, methover.class));
            }
        });
    }

    private void configurebuttone() { TextView buttone = (TextView) findViewById(R.id.polymorph);
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, poly.class));
            }
        });
    }

    private void configurebuttond() {TextView buttond = (TextView) findViewById(R.id.encapss);
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, encap.class));
            }
        });
    }

    private void configurebuttonc() {TextView buttonc = (TextView) findViewById(R.id.inheritancee);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, inh1.class));
            }
        });
    }


    private void configurebuttonb() {
        TextView buttonb = (TextView) findViewById(R.id.methodolgy);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, method.class));
            }
        });
    }

    private void configurebuttona() {
        TextView buttona = (TextView) findViewById(R.id.ClassObject);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(object.this, clas.class));
            }
            });
    }
}
