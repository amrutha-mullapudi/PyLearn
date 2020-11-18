package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;


public class module extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        TextView t2 = (TextView) findViewById(R.id.mod5);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3 = (TextView) findViewById(R.id.mod6);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
