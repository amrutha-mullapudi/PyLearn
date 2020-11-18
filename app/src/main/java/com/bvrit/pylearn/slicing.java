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
public class slicing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slicing);
        final TextView text5 = (TextView) findViewById(R.id.sl1);
        Button button42sl=(Button) findViewById(R.id.button42sl);
        button42sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("sl1", text5.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(slicing.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });

        final TextView t5 = (TextView) findViewById(R.id.sl2);
        Button button42sli=(Button) findViewById(R.id.button42sli);
        button42sli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("sl2", t5.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(slicing.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
        final TextView txt5 = (TextView) findViewById(R.id.sl3);
        Button button42slic=(Button) findViewById(R.id.button42slic);
        button42slic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("sl3", txt5.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(slicing.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
