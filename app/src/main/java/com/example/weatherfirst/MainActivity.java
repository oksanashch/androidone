package com.example.weatherfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView currentCity;
    TextView currentTemterature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentCity = findViewById(R.id.cityName);
        currentTemterature = findViewById(R.id.temperature);
        Intent intent = getIntent();
        String selectedCity = intent.getStringExtra("selectedCity");
        String temperatureOfSelectedCity = intent.getStringExtra("temperatureOfSelectedCity");
        if (selectedCity != null || temperatureOfSelectedCity != null) {
            currentCity.setText(selectedCity);
            currentTemterature.setText(temperatureOfSelectedCity);
        }
    }

    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.imageButton1:
                intent = new Intent(this, CitiesActivity.class);
                break;

            case R.id.imageButton2:
                intent = new Intent(this, SettingsActivity.class);
                break;

            default:
                break;
        }
        if (intent != null) startActivity(intent);

    }
}
