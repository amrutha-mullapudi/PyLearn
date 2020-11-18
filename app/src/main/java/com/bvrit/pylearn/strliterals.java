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
public class strliterals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strliterals);
        final TextView text3 = (TextView) findViewById(R.id.str1);
        Button button42s=(Button) findViewById(R.id.button42s);
        button42s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("str1", text3.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(strliterals.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

        final TextView t3 = (TextView) findViewById(R.id.str2);
        Button button42st=(Button) findViewById(R.id.button42st);
        button42st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("str2", t3.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(strliterals.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txt3 = (TextView) findViewById(R.id.str3);
        Button button42str=(Button) findViewById(R.id.button42str);
        button42str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("str3", txt3.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(strliterals.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
