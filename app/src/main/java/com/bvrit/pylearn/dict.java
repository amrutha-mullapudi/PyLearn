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


public class dict extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);
        TextView t= (TextView) findViewById(R.id.d18);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.d19);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text17 = (TextView) findViewById(R.id.d1);
        Button button42d0 = (Button) findViewById(R.id.button42d0);
        button42d0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("d1", text17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(dict.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t17 = (TextView) findViewById(R.id.d4);
        Button button42d1 = (Button) findViewById(R.id.button42d1);
        button42d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("d4", t17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(dict.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tx17 = (TextView) findViewById(R.id.d6);
        Button button42d2 = (Button) findViewById(R.id.button42d2);
        button42d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("d6", tx17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(dict.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView txt17 = (TextView) findViewById(R.id.d9);
        Button button42d3 = (Button) findViewById(R.id.button42d3);
        button42d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("d9", txt17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(dict.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tex17 = (TextView) findViewById(R.id.d12);
        Button button42d4 = (Button) findViewById(R.id.button42d4);
        button42d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("d12", tex17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(dict.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

        final TextView tt17 = (TextView) findViewById(R.id.d15);
        Button button42d5 = (Button) findViewById(R.id.button42d5);
        button42d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("d15", tt17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(dict.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

