package com.example.gym69;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ImageButton nextPageBtnnews = (ImageButton)findViewById(R.id.newsbutton);
        nextPageBtnnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(news.this, news.class);
                startActivity(intent);
            }
        });

        ImageButton nextPageBtnhome = (ImageButton)findViewById(R.id.home);
        nextPageBtnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(news.this, home.class);
                startActivity(intent);
            }
        });

        ImageButton nextPageBtntku = (ImageButton)findViewById(R.id.tku);
        nextPageBtntku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(news.this, TKU.class);
                startActivity(intent);
            }
        });
        /*
        ImageButton nextPageBtnsport = (ImageButton)findViewById(R.id.sport);
        nextPageBtnsprot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(news.this, sport.class);
                startActivity(intent);
            }
        });
        ImageButton nextPageBtnpro = (ImageButton)findViewById(R.id.profile);
        nextPageBtnpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(news.this, profile.class);
                startActivity(intent);
            }
        });*/
    }
}