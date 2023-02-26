package com.example.smartfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Language extends AppCompatActivity {
    ListView langlist;
    
    ArrayList<String> ArrLang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);


        langlist= findViewById(R.id.langlist);

      ArrLang.add("English");
        ArrLang.add("Hindi");
        ArrLang.add("Bangali");
        ArrLang.add("Punjabi");
        ArrLang.add("Oodiya");
        ArrLang.add("Gujrati");
        ArrLang.add("Kashmiri");
        ArrLang.add("Telugu");
        ArrLang.add("Urdu");
        ArrLang.add("Tamil");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,ArrLang);
        langlist.setAdapter(adapter);



    }
}