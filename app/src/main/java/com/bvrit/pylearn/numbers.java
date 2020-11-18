package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.ClipboardManager;
import android.widget.Toast;


public class numbers extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final TextView text1 = (TextView) findViewById(R.id.intb);
        Button button42n = (Button) findViewById(R.id.button42n);
        button42n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("intb", text1.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(numbers.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t1 = (TextView) findViewById(R.id.floatb);
        Button button42f = (Button) findViewById(R.id.button42f);
        button42f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("floatb", t1.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(numbers.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView txt1 = (TextView) findViewById(R.id.complexb);
        Button button42com = (Button) findViewById(R.id.button42com);
        button42com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("complexb", txt1.getText().toString());
                Clipboard.setPrimaryClip(clip);
           Toast.makeText(numbers.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
