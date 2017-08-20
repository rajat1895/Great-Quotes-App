package com.quotesapp.rajat.myplaystoreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BasicMenuActivity {

    private static Button bttn_philosophers;
    private static Button bttn_spritual;
    private static Button bttn_motivational;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonPhilosopherListner();
        onClickButtonSpritualListner();
        onClickButtonMotivationalListner();
    }

    public void onClickButtonPhilosopherListner(){
        bttn_philosophers=(Button)findViewById(R.id.button);
        bttn_philosophers.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.quotesapp.rajat.myplaystoreapp.philosophers");
                        startActivity(intent);
                    }
                }
        );
    }

    public void onClickButtonSpritualListner(){
        bttn_spritual=(Button)findViewById(R.id.button2);
        bttn_spritual.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.quotesapp.rajat.myplaystoreapp.Spritual");
                        startActivity(intent);
                    }
                }
        );
    }
    public void onClickButtonMotivationalListner(){
        bttn_motivational=(Button)findViewById(R.id.button3);
        bttn_motivational.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.quotesapp.rajat.myplaystoreapp.Motivational");
                        startActivity(intent);
                    }
                }
        );
    }


}
