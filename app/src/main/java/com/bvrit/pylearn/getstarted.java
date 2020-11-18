package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class getstarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
        configurewhy_py();
        configurebasic();
        configureloop();
        configure_inbuilt();
        configure_object();
        configure_exception();
        configure_reg();
        advancedconfigure();
        configuredatabase();
        webdevpy();
        datasc();
        functions();
        arraysfun();
        faqss();
    }

    private void faqss() {
        ImageView imageView = (ImageView) findViewById(R.id.faqs);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, faq.class));
            }
        });
    }

    private void arraysfun() {
        ImageView imageView = (ImageView) findViewById(R.id.arrays1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, arrays.class));
            }
        });
    }

    private void functions() {
        ImageView imageView = (ImageView) findViewById(R.id.functionsss);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, funct.class));
            }
        });
    }

    private void datasc() {
        ImageView imageView = (ImageView) findViewById(R.id.datas);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, datascience.class));
            }
        });
    }

    private void webdevpy() {

        ImageView imageView = (ImageView) findViewById(R.id.webdev);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, webdev.class));
            }
        });
    }

    private void configuredatabase() {
        ImageView imageView = (ImageView) findViewById(R.id.sqll);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, sql.class));
            }
        });
    }

    private void advancedconfigure() {
        ImageView imageView = (ImageView) findViewById(R.id.advanc);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, advanced.class));
            }
        });
    }

    private void configure_reg() {
        ImageView imageView = (ImageView) findViewById(R.id.reg);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, regx.class));
            }
        });
    }

    private void configure_exception() {
        ImageView imageView = (ImageView) findViewById(R.id.except);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, trye.class));
            }
        });
    }

    private void configure_object() {
        ImageView imageView = (ImageView) findViewById(R.id.object);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, object.class));
            }
        });
    }

    private void configure_inbuilt() {
        ImageView imageView = (ImageView) findViewById(R.id.infunct);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, inbuilt.class));
            }
        });
    }

    private void configureloop() {
        ImageView imageView = (ImageView) findViewById(R.id.loops);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, loops.class));
            }
        });
    }

    private void configurebasic() {
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.basic);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, basics.class));
            }
        });
    }

    private void configurewhy_py() {
        ImageView imageView = (ImageView) findViewById(R.id.why_py);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getstarted.this, why_python.class));
            }
        });
    }

    }