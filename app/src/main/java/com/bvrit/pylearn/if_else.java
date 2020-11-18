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
public class if_else extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else);
        TextView t= (TextView) findViewById(R.id.iffi);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.iffj);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text10 = (TextView) findViewById(R.id.ifc);
        Button button42if=(Button) findViewById(R.id.button42if);
        button42if.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("ifc", text10.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(if_else.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView t10 = (TextView) findViewById(R.id.iff);
        Button button42if1=(Button) findViewById(R.id.button42if1);
        button42if1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("iff", t10.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(if_else.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

