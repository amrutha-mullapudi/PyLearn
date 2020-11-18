package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class packages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages);
        TextView t2= (TextView) findViewById(R.id.pack5);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.pack6);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
