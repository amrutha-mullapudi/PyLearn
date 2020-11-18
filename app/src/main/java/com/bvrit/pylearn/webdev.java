package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class webdev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webdev);
        TextView t2= (TextView) findViewById(R.id.webdevops);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}