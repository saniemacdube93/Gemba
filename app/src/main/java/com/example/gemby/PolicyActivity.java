package com.example.gemby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

//color 1 is #3e4095
//color 2 is #ec268f
//color 3 is #00a859

public class PolicyActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//    String[] bankNames={"English","French","Spanish","German","Russian"};
//    String[] countryName={"South Africa","Zimbabwe","Botswana","Zambia" , "France","England" , "Japan","Russia"};
////0772119836
//    Spinner spinner;
//    Spinner spinner2;

    String[] bankNames={"English","French","Spanish","German","Russian"};
    String[] countryName={"South Africa","Zimbabwe","Botswana","Zambia" , "France","England" , "Japan","Russia"};

    Button button;

  TextInputLayout textInputLayout;
  AutoCompleteTextView autoCompleteTextView;

  ArrayList<String> arrayList;
  ArrayAdapter<String> arrayAdapter;


    TextInputLayout textInputLayout2;
    AutoCompleteTextView autoCompleteTextView2;
    ArrayList<String> arrayList2;
    ArrayAdapter<String> arrayAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backup);

        // SELECT YOUR LANGUAGE
        textInputLayout = (TextInputLayout) findViewById(R.id.textInputLayout);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.menuAutocomplete);
        arrayList = new ArrayList<>();
        arrayList.add("    English");
        arrayList.add("    Afrikaans");
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.drop_down_layout,arrayList);
        autoCompleteTextView.setAdapter(arrayAdapter);

        // SELECT YOUR LANGUAGE
        textInputLayout2 = (TextInputLayout) findViewById(R.id.textInputLayout2);
        autoCompleteTextView2 = (AutoCompleteTextView) findViewById(R.id.menuAutocomplete2);
        arrayList2 = new ArrayList<>();
        arrayList2.add("    South Africa");
        arrayList2.add("    Zimbabwe");
        arrayAdapter2 = new ArrayAdapter<>(getApplicationContext(),R.layout.drop_down_layout,arrayList2);
        autoCompleteTextView2.setAdapter(arrayAdapter2);


        //continue button
         button = (Button)  findViewById(R.id.submit);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(PolicyActivity.this, TermsandCondtitions.class);
                 startActivity(intent);
             }
         });




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}