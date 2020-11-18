package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class inh1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inh1);
        configurebuttona1();
        configurebuttona2();
        configurebuttona3();
    }



    private void configurebuttona3() {
        TextView buttona3 = (TextView) findViewById(R.id.MULTILEVEL);
        buttona3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inh1.this, multilevel.class));
            }
        });
    }


    private void configurebuttona1() {
        TextView buttona1 = (TextView) findViewById(R.id.INHERITANCES);
        buttona1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inh1.this, inher.class));
            }
        });
    }

    private void configurebuttona2() {
        TextView buttona2 = (TextView) findViewById(R.id.MULTIPLE);
        buttona2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inh1.this, multiple.class));
            }
        });
    }
}
