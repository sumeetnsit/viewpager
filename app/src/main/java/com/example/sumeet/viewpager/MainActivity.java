package com.example.sumeet.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton mimageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }



    public void addListenerOnButton() {

        mimageButton = (ImageButton) findViewById(R.id.imageButton);
        final Intent intent = new Intent(this,PagerActivity.class);

        mimageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
            startActivity(intent);

            }

        });

    }

}
