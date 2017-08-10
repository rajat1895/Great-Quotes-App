package com.quotesapp.rajat.myplaystoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Spritual extends AppCompatActivity {

    ListView list;
    String[] sprit = {
            "Gautama Buddha",
            "Paramahansa Yogananda",
            "14 th  Dalai Lama",
            "Jaggi Vasudev (Sadhguru)",
            "Sandeep Maheshwari",
            "Eckhart Tolle",
            "Spiritual Books",
            "Spiritual Videos",
    };

    Integer[] imageId2 = {
            R.drawable.bhudhha,
            R.drawable.paramahansa_yogananda,
            R.drawable.dalailama,
            R.drawable.sadhguru,
            R.drawable.sandeep,
            R.drawable.eckhharttolle,
            R.drawable.amazon,
            R.drawable.youtube,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spritual);

        customize_list adapter = new
                customize_list(Spritual.this, sprit,imageId2);
        list = (ListView) findViewById(R.id.listView_spritual);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), BhudhhaActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), YoganandaActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), DalaiLamaActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), SadhguruActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), SandeepMaheshwariActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), TolleActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), SpritualBooksActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), SpritualVideosActivity.class);
                    startActivityForResult(myIntent, 0);
                }



            }
        });
    }
}



