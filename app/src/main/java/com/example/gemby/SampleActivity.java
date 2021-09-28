package com.example.gemby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

//color 1 is #3e4095
//color 2 is #ec268f
//color 3 is #00a859
public class SampleActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] bankNames={"English","French","Spanish","German","Russian"};
    String[] countryName={"South Africa","Zimbabwe","Botswana","Zambia" , "France","England" , "Japan","Russia"};
    //0772119836
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);
        spinner2 = (Spinner) findViewById(R.id.spinner2);








        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bankNames);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setOnItemSelectedListener(this);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countryName);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);





    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}