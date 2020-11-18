package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.ClipboardManager;
import android.widget.Toast;


public class tuple extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuple);
        TextView t= (TextView) findViewById(R.id.t15);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.t16);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text16 = (TextView) findViewById(R.id.t1);
        Button button42t = (Button) findViewById(R.id.button42t);
        button42t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("t1", text16.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(tuple.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t16 = (TextView) findViewById(R.id.t3);
        Button button42t1 = (Button) findViewById(R.id.button42t1);
        button42t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("t3", t16.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(tuple.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView tx16 = (TextView) findViewById(R.id.t5);
        Button button42t2 = (Button) findViewById(R.id.button42t2);
        button42t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("t5", tx16.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(tuple.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView txt16 = (TextView) findViewById(R.id.t7);
        Button button42t3 = (Button) findViewById(R.id.button42t3);
        button42t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("t7", txt16.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(tuple.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView te16 = (TextView) findViewById(R.id.t9);
        Button button42t4 = (Button) findViewById(R.id.button42t4);
        button42t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("t9", te16.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(tuple.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView tt16 = (TextView) findViewById(R.id.t11);
        Button button42t5 = (Button) findViewById(R.id.button42t5);
        button42t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("t11", tt16.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(tuple.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
