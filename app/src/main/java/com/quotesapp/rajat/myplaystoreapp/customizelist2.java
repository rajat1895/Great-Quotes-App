package com.quotesapp.rajat.myplaystoreapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rajat on 8/3/2017.
 */
public class customizelist2  extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] sprit;
    private final Integer[] imageId2;
    public customizelist2(Activity context,
                          String[] sprit,Integer[] imageId2) {
        super(context, R.layout.list_view1, sprit);
        this.context = context;
        this.sprit = sprit;
        this.imageId2 = imageId2;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_view1, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(sprit[position]);

        imageView.setImageResource(imageId2[position]);
        return rowView;
    }
}


