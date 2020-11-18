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
public class booleans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booleans);
        final TextView text2 = (TextView) findViewById(R.id.bfunb);
        Button button42o=(Button) findViewById(R.id.button42o);
        button42o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("bfunb", text2.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(booleans.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView t2 = (TextView) findViewById(R.id.bfunc);
        Button button42oo=(Button) findViewById(R.id.button42oo);
        button42oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("bfunc", t2.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(booleans
                        .this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });


    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
