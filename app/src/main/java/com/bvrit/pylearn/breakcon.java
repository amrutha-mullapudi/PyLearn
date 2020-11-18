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
public class breakcon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakcon);
        TextView t= (TextView) findViewById(R.id.b13);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.b14);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text14 = (TextView) findViewById(R.id.b1);
        Button button42br=(Button) findViewById(R.id.button42br);
        button42br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("b1", text14.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(breakcon.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView t14 = (TextView) findViewById(R.id.b4);
        Button button42br1=(Button) findViewById(R.id.button42br1);
        button42br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("b4", t14.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(breakcon.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txt14 = (TextView) findViewById(R.id.b7);
        Button button42br2=(Button) findViewById(R.id.button42br2);
        button42br2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("b7", txt14.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(breakcon.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tt14 = (TextView) findViewById(R.id.b10);
        Button button42br3=(Button) findViewById(R.id.button42br3);
        button42br3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("b10", tt14.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(breakcon.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

