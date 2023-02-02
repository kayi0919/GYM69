package com.example.gym69;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TKU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tku);

        ImageButton nextPageBtnnews = (ImageButton)findViewById(R.id.newsbutton);
        nextPageBtnnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TKU.this, news.class);
                startActivity(intent);
            }
        });

        ImageButton nextPageBtnhome = (ImageButton)findViewById(R.id.home);
        nextPageBtnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TKU.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton nextPageBtntku = (ImageButton)findViewById(R.id.tku);
        nextPageBtntku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TKU.this, TKU.class);
                startActivity(intent);
            }
        });
        /*
        ImageButton nextPageBtnsport = (ImageButton)findViewById(R.id.sport);
        nextPageBtnsprot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TKU.this, sport.class);
                startActivity(intent);
            }
        });
        ImageButton nextPageBtnpro = (ImageButton)findViewById(R.id.profile);
        nextPageBtnpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TKU.this, profile.class);
                startActivity(intent);
            }
        });*/
    }
}