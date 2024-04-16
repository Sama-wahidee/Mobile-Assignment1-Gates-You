package com.bzu1211503.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class EorActivity extends AppCompatActivity {
        private boolean isLampOn = false;
        private boolean isSwitch1On = false;
        private boolean isSwitch2On = false;
        private ImageView switchImage1;
        private ImageView switchImage2;
        private ImageView lampImage;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eor);

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
                    // Toggle the lamp image when switch 1 is clicked
                    toggleLampImage();
                }
            });

            switchImage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toggle the state of switch 2 and update the switch image
                    isSwitch2On = !isSwitch2On;
                    setSwitchImages();
                    // Toggle the lamp image when switch 2 is clicked
                    toggleLampImage();
                }
            });
        }

        private void toggleLampImage() {
            // Toggle the lamp state based on OR gate logic
            isLampOn = isSwitch1On || isSwitch2On;
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