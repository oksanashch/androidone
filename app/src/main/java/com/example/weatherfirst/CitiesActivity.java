package com.example.weatherfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class CitiesActivity extends Activity implements View.OnClickListener {

    TextView selectedCity;
    TextView temperatureOfSelectedCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cities);

    }

    @Override
    public void onClick(View view) {
        TableRow row = (TableRow) view;
        selectedCity = (TextView) row.getChildAt(0);
        temperatureOfSelectedCity = (TextView) row.getChildAt(1);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("selectedCity", selectedCity.getText().toString());
        intent.putExtra("temperatureOfSelectedCity", temperatureOfSelectedCity.getText().toString());
        startActivity(intent);

    }

}



