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
public class fors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fors);
        TextView t= (TextView) findViewById(R.id.f13);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.f14);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text13 = (TextView) findViewById(R.id.f1);
        Button button42f=(Button) findViewById(R.id.button42f);
        button42f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("f1", text13.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(fors.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView t13 = (TextView) findViewById(R.id.f4);
        Button button42f1=(Button) findViewById(R.id.button42f1);
        button42f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("f4", t13.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(fors.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txt13 = (TextView) findViewById(R.id.f7);
        Button button42f2=(Button) findViewById(R.id.button42f2);
        button42f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("w7", txt13.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(fors.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tt13 = (TextView) findViewById(R.id.f10);
        Button button42f3=(Button) findViewById(R.id.button42f3);
        button42f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("f10", tt13.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(fors.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

