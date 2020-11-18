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


public class variable_py extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_py);
        final TextView text = (TextView) findViewById(R.id.exm2);
        Button button42=(Button) findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("exm2", text.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(variable_py.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t = (TextView) findViewById(R.id.exm3);
        Button button42a=(Button) findViewById(R.id.button42a);
        button42a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("exm3", t.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(variable_py.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
