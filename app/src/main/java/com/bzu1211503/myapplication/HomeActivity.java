package com.bzu1211503.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView = findViewById(R.id.listView);
        String[] options = {"Learn about logic gates", "Explore with logic gates", "Quick test", "About"};
        int[] icons = {R.drawable.learn, R.drawable.explore, R.drawable.test, R.drawable.about};

        // Custom adapter to show text and icon in each row
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, icons);
        listView.setAdapter(adapter);

        // Set click listener for list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Handle item click here
                String selectedItem = options[position];
                // Start the corresponding activity based on the selected item
                switch (selectedItem) {
                    case "Learn about logic gates":
                        startActivity(new Intent(HomeActivity.this, LearnActivity.class));
                        break;
                    case "Explore with logic gates":
                        startActivity(new Intent(HomeActivity.this, ExploreActivity.class));
                        break;
                    case "Quick test":
                        startActivity(new Intent(HomeActivity.this, q1Activity.class));
                        break;
                    case "About":
                        startActivity(new Intent(HomeActivity.this, AboutActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
