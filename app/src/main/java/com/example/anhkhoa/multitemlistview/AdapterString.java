package com.example.anhkhoa.multitemlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anh khoa on 1/15/2018.
 */

public class AdapterString extends ArrayAdapter<String> {
    @NonNull Activity context;
    int resource;
    @NonNull List<String> objects;

    public AdapterString(@NonNull Activity context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=this.context.getLayoutInflater();
        View row=layoutInflater.inflate(this.resource,null);
        TextView txtString=row.findViewById(R.id.txtitemString);
        String rstr=this.objects.get(position);
        txtString.setText(rstr.toString());
        return row;
    }
}
