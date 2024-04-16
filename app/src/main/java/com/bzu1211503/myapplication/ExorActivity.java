package com.bzu1211503.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class ExorActivity extends AppCompatActivity {

    private boolean isLampOn = false;
    private boolean isSwitch1On = false;
    private boolean isSwitch2On = false;
    private ImageView switchImage1;
    private ImageView switchImage2;
    private ImageView lampImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eand);

        switchImage1 = findViewById(R.id.switchImage1);
        switchImage2 = findViewById(R.id.switchImage2);
        lampImage = findViewById(R.id.lampImage);

        // Initially set the lamp image and switch images according to their states
        setLampImage();
        setSwitchImages();

        switchImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of switch 1 and update the switch image
                isSwitch1On = !isSwitch1On;
                setSwitchImages();
                // Update the lamp image when either switch is clicked
                updateLampImage();
            }
        });

        switchImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the state of switch 2 and update the switch image
                isSwitch2On = !isSwitch2On;
                setSwitchImages();
                // Update the lamp image when either switch is clicked
                updateLampImage();
            }
        });
    }

    private void updateLampImage() {
        // XOR gate logic: lamp is on if only one switch is on
        isLampOn = (isSwitch1On || isSwitch2On) && !(isSwitch1On && isSwitch2On);
        // Update the lamp image according to the new state
        setLampImage();
    }

    private void setLampImage() {
        if (isLampOn) {
            lampImage.setImageResource(R.drawable.onl);
        } else {
            lampImage.setImageResource(R.drawable.offl);
        }
    }

    private void setSwitchImages() {
        // Set the switch images according to their states
        switchImage1.setImageResource(isSwitch1On ? R.drawable.on : R.drawable.off);
        switchImage2.setImageResource(isSwitch2On ? R.drawable.on : R.drawable.off);
    }
}
