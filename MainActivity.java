package com.example.pizza_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v) {
        RadioButton rb1, rb2, rb3, rb4;

        ImageView iv1 = (ImageView)findViewById(R.id.iv1_image);

        rb1 = (RadioButton) findViewById(R.id.rb_olive);
        rb2 = (RadioButton) findViewById(R.id.rb_bacon);
        rb3 = (RadioButton) findViewById(R.id.rb_pepperoni);
        rb4 = (RadioButton) findViewById(R.id.rb_pineapple);
        if (rb1.isChecked()) {
            iv1.setImageResource(R.drawable.olive);
        }
        else if (rb2.isChecked()) {
            iv1.setImageResource(R.drawable.canadian);
    }
        else if (rb3.isChecked()) {
            iv1.setImageResource(R.drawable.pepperoni);
        }
        else if (rb4.isChecked()) {
            iv1.setImageResource(R.drawable.pineapples);
        }
        else {
            iv1.setImageResource(R.drawable.pizza1);
        }

    }

    {

    }
}