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


public class clas extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clas);
        final TextView text18 = (TextView) findViewById(R.id.cl2a);
        Button button42cl=(Button) findViewById(R.id.button42cl);
        button42cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("cl2a", text18.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(clas.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });
        final TextView te18 = (TextView) findViewById(R.id.cl3);
        Button button42cl1=(Button) findViewById(R.id.button42cl1);
        button42cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("cl3", te18.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(clas.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });


    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
