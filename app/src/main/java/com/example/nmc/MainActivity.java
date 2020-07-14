package com.example.nmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Vendor Details");
        arrayList.add("Payment History");
        arrayList.add("Order History");
        arrayList.add("Pending Order");
        arrayList.add("Pending Payment");


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.layout.activity_list_of,arrayList);
        listView.setAdapter(adapter);






        Button add_new_pdt_btn = (Button) findViewById(R.id.add_new_pdt_btn);
        add_new_pdt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddNewPdt_Activity.class));
            }
        });
    }
}