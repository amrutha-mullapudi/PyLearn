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
public class whilee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whilee);
        TextView t= (TextView) findViewById(R.id.w10);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.w11);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text12 = (TextView) findViewById(R.id.w1);
        Button button42wh=(Button) findViewById(R.id.button42wh);
        button42wh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("w1", text12.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(whilee.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView t12 = (TextView) findViewById(R.id.w4);
        Button button42wh1=(Button) findViewById(R.id.button42wh1);
        button42wh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("w4", t12.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(whilee.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txt12 = (TextView) findViewById(R.id.w7);
        Button button42wh2=(Button) findViewById(R.id.button42wh2);
        button42wh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("w7", txt12.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(whilee.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

