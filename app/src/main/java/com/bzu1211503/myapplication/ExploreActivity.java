package com.bzu1211503.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        ImageView notImage = findViewById(R.id.not);
        TextView notDescription = findViewById(R.id.notDescription);
        ImageView andImage = findViewById(R.id.and);
        TextView andDescription = findViewById(R.id.andDescription);
        ImageView orImage = findViewById(R.id.or);
        TextView orDescription = findViewById(R.id.orDescription);
        ImageView xorImage = findViewById(R.id.xor);
        TextView xorDescription = findViewById(R.id.xorDescription);

        // Set click listeners for NOT Gate
        notImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotActivity();
            }
        });

        notDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotActivity();
            }
        });

        // Set click listeners for AND Gate
        andImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAndActivity();
            }
        });

        andDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAndActivity();
            }
        });

        // Set click listeners for OR Gate
        orImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrActivity();
            }
        });

        orDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrActivity();
            }
        });

        // Set click listeners for XOR Gate
        xorImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openXorActivity();
            }
        });

        xorDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openXorActivity();
            }
        });
    }

    private void openNotActivity() {
        // Start the activity for NOT Gate
        Intent intent = new Intent(this, EnotActivity.class);
        startActivity(intent);
    }

   private void openAndActivity() {
        // Start the activity for AND Gate
        Intent intent = new Intent(this, EandActivity.class);
        startActivity(intent);
    }

   private void openOrActivity() {
        // Start the activity for OR Gate
        Intent intent = new Intent(this, EorActivity.class);
        startActivity(intent);
    }

    private void openXorActivity() {
        // Start the activity for XOR Gate
        Intent intent = new Intent(this, ExorActivity.class);
        startActivity(intent);
    }
}