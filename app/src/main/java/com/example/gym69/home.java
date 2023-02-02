package com.example.gym69;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton nextPageBtn = (ImageButton)findViewById(R.id.newsbutton);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(home.this, news.class);
                startActivity(intent);
            }
        });
        ImageButton nextPageBtn2 = (ImageButton)findViewById(R.id.home);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(home.this, home.class);
                startActivity(intent);
            }
        });
        ImageButton nextPageBtntku = (ImageButton)findViewById(R.id.tku);
        nextPageBtntku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(home.this, TKU.class);
                startActivity(intent);
            }
        });
        /*
        ImageButton nextPageBtnsport = (ImageButton)findViewById(R.id.sport);
        nextPageBtnsprot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(home.this, sport.class);
                startActivity(intent);
            }
        });
        ImageButton nextPageBtnpro = (ImageButton)findViewById(R.id.profile);
        nextPageBtnpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(home.this, profile.class);
                startActivity(intent);
            }
        });*/
    }
}