package com.costabianca.appxotristeza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    int click = 0;
    ImageView smile;
    TextView tvZerar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btclick;
        btclick = (Button) findViewById(R.id.btClick);
        smile = findViewById(R.id.imageView);
        tvZerar = findViewById(R.id.tvZerar);
        TextView text = (TextView) findViewById(R.id.tvContagem);
        ((TextView) text).setText("0");


        tvZerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = 0;
                ((TextView) text).setText("0");
                smile.setImageResource(R.drawable.smile01);


            }
        });

        btclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                click++;
                ((TextView) text).setText(String.valueOf(click));
                 if (click == 10) {
                     smile.setImageResource(R.drawable.smile02);
                }
                if (click == 20){
                    smile.setImageResource(R.drawable.smile03);
                }
                if (click == 30){
                    smile.setImageResource(R.drawable.smile04);
                }
                if (click == 40){
                    smile.setImageResource(R.drawable.smile05);
                }
                if (click == 50) {
                    smile.setImageResource(R.drawable.smile06);
                }
                if (click == 60) {
                    smile.setImageResource(R.drawable.smile07);
                }
                if (click == 70) {
                    smile.setImageResource(R.drawable.smile08);
                }
                if (click == 80) {
                    smile.setImageResource(R.drawable.smile09);
                }
                if (click == 90) {
                    smile.setImageResource(R.drawable.smile10);
                }
                if (click == 100) {
                    smile.setImageResource(R.drawable.smile11);
                }



            }
        });




    }

    private class tvContagem {
    }
}