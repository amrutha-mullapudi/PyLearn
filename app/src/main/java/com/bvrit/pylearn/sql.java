package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class sql extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);
        TextView t2= (TextView) findViewById(R.id.sqll6);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}