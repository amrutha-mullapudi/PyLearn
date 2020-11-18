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


public class inher extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inher);
        final TextView text20 = (TextView) findViewById(R.id.inh2);
        Button button42in = (Button) findViewById(R.id.button42in);
        button42in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("inh2", text20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(inher.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView te20 = (TextView) findViewById(R.id.inh5);
        Button button42in1 = (Button) findViewById(R.id.button42in1);
        button42in1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("inh5", te20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(inher.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });

        final TextView tex20 = (TextView) findViewById(R.id.inh8);
        Button button42in2 = (Button) findViewById(R.id.button42in2);
        button42in2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("inh8", tex20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(inher.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
