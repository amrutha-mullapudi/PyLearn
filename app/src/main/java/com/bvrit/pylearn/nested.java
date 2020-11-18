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

public class nested extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);
        TextView t= (TextView) findViewById(R.id.n7);
        t.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t1= (TextView) findViewById(R.id.n8);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text15 = (TextView) findViewById(R.id.n1);
        Button button42n = (Button) findViewById(R.id.button42n);
        button42n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("n1", text15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(nested.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView t15 = (TextView) findViewById(R.id.n4);
        Button button42n1 = (Button) findViewById(R.id.button42n1);
        button42n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("n4", t15.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(nested.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}

