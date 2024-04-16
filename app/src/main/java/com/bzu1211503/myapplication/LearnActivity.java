package com.bzu1211503.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        ImageView notImage = findViewById(R.id.not);
        TextView notDescription = findViewById(R.id.LnotDescription);
        ImageView andImage = findViewById(R.id.Land);
        TextView andDescription = findViewById(R.id.LandDescription);
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
        Intent intent = new Intent(this, LnotActivity.class);
        startActivity(intent);
    }

    private void openAndActivity() {
        // Start the activity for AND Gate
        Intent intent = new Intent(this, LandActivity.class);
        startActivity(intent);
    }

    private void openOrActivity() {
        // Start the activity for OR Gate
        Intent intent = new Intent(this, LorActivity.class);
        startActivity(intent);
    }

    private void openXorActivity() {
        // Start the activity for XOR Gate
        Intent intent = new Intent(this, LxorActivity.class);
        startActivity(intent);
    }
}