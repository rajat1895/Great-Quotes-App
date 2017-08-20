package com.quotesapp.rajat.myplaystoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class philosophers extends AppCompatActivity {

    ListView list;
    String[] philo = {
            "Thales",
            "Anaximander",
            "Socrates",
            "Plato",
            "Aristotle",
            "Søren Kierkegaard",
            "Immanuel kant",
            "Paul Sartre",
            "Rene Descrates",
            "Fredrich Neitsche",
    };

    Integer[] imageId = {
            R.drawable.thales,
            R.drawable.anaximandre,
            R.drawable.socrates,
            R.drawable.plato,
            R.drawable.aristotle,
            R.drawable.soren,
            R.drawable.kant,
            R.drawable.sarte,
            R.drawable.rene,
            R.drawable.friedrich

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophers);
        customize_list adapter = new
                    customize_list(philosophers.this, philo,imageId);
            list = (ListView) findViewById(R.id.listView_phil);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ThalesActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), AnaximanderActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), SocratesActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), PaltoActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), AristotleActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), SorenKierkegaardActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ImmanuelKantActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), PaulSartreActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ReneDescratesActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), FredrichNeitscheActivity.class);
                    startActivityForResult(myIntent, 0);
                }



            }
        });
    }
}
