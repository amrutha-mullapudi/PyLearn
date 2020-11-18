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


public class manip extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manip);
        final TextView text20 = (TextView) findViewById(R.id.trye2);
        Button button42manip = (Button) findViewById(R.id.button42manip);
        button42manip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tyre2", text20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(manip.this,"Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView tex20 = (TextView) findViewById(R.id.trye5);
        Button button42manip1 = (Button) findViewById(R.id.button42manip1);
        button42manip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tyre5", tex20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(manip.this,"Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView te20 = (TextView) findViewById(R.id.trye8);
        Button button42manip2 = (Button) findViewById(R.id.button42manip2);
        button42manip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tyre8", te20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(manip.this,"Copied", Toast.LENGTH_SHORT).show();

            }
        });


    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
