package com.example.nmc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionEntry;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AddNewPdt_Activity extends AppCompatActivity {

    private Uri filepath;
    private ImageView fileimage;
    private ProgressBar upload_progress;
    private TextView product_warning;
    private TextView serial_warning;
    private EditText product_name;
    private EditText serial_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_pdt_);


        final Button upload_btn = (Button) findViewById(R.id.upload_btn);
        Button addbtn = (Button) findViewById(R.id.addbtn);
        fileimage = (ImageView) findViewById(R.id.fileimage);
        product_warning = (TextView) findViewById(R.id.warning_pdt);
        serial_warning = (TextView) findViewById(R.id.warningserial);
        upload_progress = (ProgressBar) findViewById(R.id.upload_progress);
        upload_progress.setVisibility(View.INVISIBLE);
        upload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), 234);
            }
        });

        product_name = (EditText) findViewById(R.id.product_name);
        serial_number = (EditText) findViewById(R.id.serial_number);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                product_warning.setText("");
                serial_warning.setText("");
                if(filepath != null && !product_name.getText().toString().equals("") && !serial_number.getText().toString().equals(""))
                {
                    upload_progress.setVisibility(View.VISIBLE);
                    Context context = getApplicationContext();
                    String product_serial_number = serial_number.getText().toString();
                    StorageConnector storageConnector = new StorageConnector();
                    storageConnector.upload_file(filepath, product_serial_number, context, upload_progress);
                    ProductModel productModel = new ProductModel();
                    productModel.setProductDetails(product_name.getText().toString(), serial_number.getText().toString(), "");
                    HashMap<String, Object> productModel_hashmap = new HashMap<>();
                    productModel_hashmap = productModel.ConvertObjectToMap();
                    DBConnector dbConnector = new DBConnector();
                    dbConnector.add_product(productModel_hashmap);
                }
                if(product_name.getText().toString().equals(""))
                {
                    product_warning.setText("Please Enter this field");
                }
                if(serial_number.getText().toString().equals(""))
                {
                    serial_warning.setText("Please Enter this field");
                }
                if(filepath == null)
                {
                    Toast.makeText(getApplicationContext(), "Please upload image of the product", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 234 && resultCode == RESULT_OK && data != null && data.getData() != null)
        {
            filepath = data.getData();
            Log.d("d","filepath = "+filepath);
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filepath);
                fileimage.setImageBitmap(bitmap);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}