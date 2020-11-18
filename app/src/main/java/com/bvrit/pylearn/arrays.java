package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class arrays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays);
        TextView t2= (TextView) findViewById(R.id.COMPILE);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3= (TextView) findViewById(R.id.WEBARRAY);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t4= (TextView) findViewById(R.id.YOUTUBEARRAY);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
