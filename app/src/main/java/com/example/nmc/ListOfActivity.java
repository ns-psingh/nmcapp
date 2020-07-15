package com.example.nmc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of);

        listView = (ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Vendor Details");
        arrayList.add("Payment History");
        arrayList.add("Order History");
        arrayList.add("Pending Order");
        arrayList.add("Pending Payment");


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.layout.activity_list_of,arrayList);
        listView.setAdapter(adapter);


    }
}