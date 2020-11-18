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


public class list extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        TextView t2= (TextView) findViewById(R.id.ll2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3= (TextView) findViewById(R.id.ll3);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text15 = (TextView) findViewById(R.id.li1);
        Button button42li = (Button) findViewById(R.id.button42li);
        button42li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("li1", text15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(list.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t15 = (TextView) findViewById(R.id.li3);
        Button button42li1 = (Button) findViewById(R.id.button42li1);
        button42li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("li3", t15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(list.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView tx15 = (TextView) findViewById(R.id.li5);
        Button button42li2 = (Button) findViewById(R.id.button42li2);
        button42li2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("li5", tx15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(list.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txt15 = (TextView) findViewById(R.id.li7);
        Button button42li3 = (Button) findViewById(R.id.button42li3);
        button42li3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("li7", txt15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(list.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tt15 = (TextView) findViewById(R.id.li9);
        Button button42li4 = (Button) findViewById(R.id.button42li4);
        button42li4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("li9", tt15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(list.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tt015 = (TextView) findViewById(R.id.li11);
        Button button42li5 = (Button) findViewById(R.id.button42li5);
        button42li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("li11", tt015.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(list.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
