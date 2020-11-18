package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class fileop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileop);
        TextView t2= (TextView) findViewById(R.id.get5);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3= (TextView) findViewById(R.id.get6);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
