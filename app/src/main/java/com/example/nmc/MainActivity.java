package com.example.nmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private DBConnector dbConnector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView) findViewById(R.id.product_list);
        listview = (ListView) findViewById(R.id.product_list);
        dbConnector = new DBConnector();
        dbConnector.get_products(getApplicationContext(), listview);
        Button add_new_pdt_btn = (Button) findViewById(R.id.add_new_pdt_btn);
        add_new_pdt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddNewPdt_Activity.class));
            }
        });
    }
}