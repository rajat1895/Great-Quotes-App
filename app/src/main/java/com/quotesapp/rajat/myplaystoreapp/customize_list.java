package com.quotesapp.rajat.myplaystoreapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rajat on 7/29/2017.
 */

public class customize_list  extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] philo;
    private final Integer[] imageId;
    public customize_list(Activity context,
                          String[] philo,Integer[] imageId) {
        super(context, R.layout.list_view1, philo);
        this.context = context;
        this.philo = philo;
       this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_view1, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

       ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(philo[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}


