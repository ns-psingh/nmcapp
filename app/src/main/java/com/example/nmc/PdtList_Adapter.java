package com.example.nmc;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PdtList_Adapter extends ArrayAdapter<ProductModel> implements View.OnClickListener  {
    ArrayList<ProductModel> arrayList;
    Context context;

    @Override
    public void onClick(View view) {

    }

    private static class ViewHolder
    {
        TextView product_name;
        TextView product_serial_number;
    }

    public PdtList_Adapter(ArrayList<ProductModel> arrayList, Context context)
    {
        super(context, R.layout.product_item, arrayList);
        this.arrayList = arrayList;
        this.context = context;
    }
    private int lastPosition = -1;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ProductModel productModel = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if (convertView == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.product_item, parent, false);
            viewHolder.product_name = (TextView) convertView.findViewById(R.id.productname);
            viewHolder.product_serial_number = (TextView) convertView.findViewById(R.id.product_serial);
            result = convertView;
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        lastPosition = position;
        viewHolder.product_name.setText((String) productModel.getProductDetails().get("ProductName"));
        viewHolder.product_serial_number.setText((String) productModel.getProductDetails().get("ProductSerialNumber"));
        return  convertView;
    }
}
