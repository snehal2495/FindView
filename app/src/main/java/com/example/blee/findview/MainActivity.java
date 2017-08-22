package com.example.blee.findview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void finishEat(View v)
    {
        ImageView imageView=(ImageView)findViewById(R.id.food);
        imageView.setBackgroundResource(R.drawable.after);

        TextView textView=(TextView)findViewById(R.id.hungry);
        textView.setText("I am Full!");
    }

}
