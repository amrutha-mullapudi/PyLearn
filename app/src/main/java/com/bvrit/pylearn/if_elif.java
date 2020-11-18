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
public class if_elif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_elif);
        TextView t= (TextView) findViewById(R.id.ifp);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.ifq);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text11 = (TextView) findViewById(R.id.ifj);
        Button button42elif=(Button) findViewById(R.id.button42elif);
        button42elif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("ifj", text11.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(if_elif.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView t11 = (TextView) findViewById(R.id.ifm);
        Button button42elif1=(Button) findViewById(R.id.button42elif1);
        button42elif1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("ifm", t11.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(if_elif.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

