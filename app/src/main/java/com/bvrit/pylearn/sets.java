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


public class sets extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);
        TextView t= (TextView) findViewById(R.id.s18);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.s19);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text17 = (TextView) findViewById(R.id.s1);
        Button button42s=(Button) findViewById(R.id.button42s);
        button42s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("s1", text17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(sets.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t17 = (TextView) findViewById(R.id.s5);
        Button button42s1=(Button) findViewById(R.id.button42s1);
        button42s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("s5", t17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(sets.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });

        final TextView te17 = (TextView) findViewById(R.id.s9);
        Button button42s2=(Button) findViewById(R.id.button42s2);
        button42s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("s9", te17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(sets.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });

        final TextView tex17 = (TextView) findViewById(R.id.s11);
        Button button42s3=(Button) findViewById(R.id.button42s3);
        button42s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("s11", tex17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(sets.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });

        final TextView tt17 = (TextView) findViewById(R.id.s14);
        Button button42s4=(Button) findViewById(R.id.button42s4);
        button42s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("s14", tt17.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(sets.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });


    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
