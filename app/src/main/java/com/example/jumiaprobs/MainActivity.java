package com.example.jumiaprobs;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton  image_button;
    MaterialButton save_add;
//
    LinearLayout lay;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lay = findViewById(R.id.layout);
        lay.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.layout){
            setContentView(R.layout.address);

            save_add = findViewById(R.id.save_address);
            save_add.setOnClickListener(this);

        }


    }


//
//    @Override
//    public void onClick(View v) {
//
//        // to assign each view to its respective id's
//
//        if (v.getId() == R.id.image_back_button){
//            setContentView(R.layout.activity_main);
//            Toast.makeText(MainActivity.this,"imageBackButton Touched",Toast.LENGTH_SHORT).show();
//
//        }
//        if (v.getId() == R.id.save_address){
//            Toast.makeText(MainActivity.this,"save Address clicked",Toast.LENGTH_SHORT).show();
//
//        }
//
//    }
}