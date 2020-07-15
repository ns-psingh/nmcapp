package com.example.nmc;

import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Map;

public class DBConnector {
    FirebaseFirestore db;
    ArrayList<Map<String, Object>> products;

    public DBConnector() {
        db = FirebaseFirestore.getInstance();
        products = new ArrayList<Map<String, Object>>();
    }

    public void add_product(Map<String, Object> product) {
        db.collection("product_details").add(product).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("d", "DocumentSnapshot added with ID: " + documentReference.getId());
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("d", "Error adding document", e);
            }
        });
    }

    public void get_products(final Context context, final ListView listView)
    {
        db.collection("product_details").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful())
                {
                    products.clear();
                    for (QueryDocumentSnapshot document : task.getResult())
                    {
                        Map<String, Object> product = document.getData();
                        products.add(product);
                        Log.d("d", document.getId() + "=>" + document.getData());
                    }
                }
                else
                {
                    Log.w("d", "Error getting documents", task.getException());
                }
                ArrayList<ProductModel> productlist = new ArrayList<ProductModel>();
                for(Map<String, Object> product: products)
                {
                    productlist.add(ProductModel.convertMapToObject(product));
                }
                PdtList_Adapter adapter = new PdtList_Adapter(productlist,context);
                listView.setAdapter(adapter);
                Log.d("d","Products are " + products);
            }
        });
    }

}
