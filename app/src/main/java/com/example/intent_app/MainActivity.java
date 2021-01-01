package com.example.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List<String>list;
    public  void clickFunction(View view){
        Intent i=new Intent(getApplicationContext(),Second_Activity.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listView);
        list=new ArrayList<>();
        list.add("Siddharth");
        list.add("Arpit");
        list.add("bhai");
        list.add("Abhi bhai");
        list.add("ayush");
        list.add("mummy");
        list.add("papa");
        list.add("joey");
        list.add("twinkle");
        list.add("aman");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),list.get(position),Toast.LENGTH_SHORT).show();
                String content=list.get(position);
                Intent i=new Intent(getApplicationContext(),Second_Activity.class);
                i.putExtra("key",content);
                startActivity(i);
            }
        });
    }
}