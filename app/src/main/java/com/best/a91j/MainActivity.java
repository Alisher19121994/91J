package com.best.a91j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();
    }

    public void open() {
        imageView = findViewById(R.id.image_ID);
        Button button = findViewById(R.id.button_ID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation object = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                imageView.startAnimation(object);
            }
        });
    }
}