package com.quotesapp.rajat.myplaystoreapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Fragment1Philosophers extends Fragment{
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
    public Fragment1Philosophers() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_philosophers, container, false);
        // WebView browser = (WebView) view.findViewById(R.id.webView3);
        customize_list adapter = new
                customize_list(getActivity(), philo,imageId);
        list = (ListView) view.findViewById(R.id.listView_phil);
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
        return view;
    }
}
