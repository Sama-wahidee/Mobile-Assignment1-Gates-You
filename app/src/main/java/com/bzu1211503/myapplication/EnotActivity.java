package com.bzu1211503.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class EnotActivity extends AppCompatActivity {

    private boolean isLampOn = false;
    private ImageView switchImage;
    private ImageView lampImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enot);

        switchImage = findViewById(R.id.switchImage);
        lampImage = findViewById(R.id.lampImage);

        // Initially set the lamp image according to its state
        setLampImage();

        switchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the lamp image when the switch is clicked
                toggleLampImage();
            }
        });
    }

    private void toggleLampImage() {
        isLampOn = !isLampOn; // Toggle the lamp state
        setLampImage(); // Update the lamp image according to the new state
    }

    private void setLampImage() {
        if (isLampOn) {
            lampImage.setImageResource(R.drawable.onl);
            switchImage.setImageResource(R.drawable.off);
        } else {
            lampImage.setImageResource(R.drawable.offl);
            switchImage.setImageResource(R.drawable.on);
        }
    }
}
