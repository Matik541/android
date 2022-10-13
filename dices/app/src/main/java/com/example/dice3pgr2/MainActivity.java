package com.example.dice3pgr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Integer wylosowanaLiczba;
    public ArrayList<Integer> dices = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dices.add(R.drawable.dice_1);
        dices.add(R.drawable.dice_2);
        dices.add(R.drawable.dice_3);
        dices.add(R.drawable.dice_4);
        dices.add(R.drawable.dice_5);
        dices.add(R.drawable.dice_6);
        Button diceButton = findViewById(R.id.button);
        TextView diceTextView = findViewById(R.id.textView);
        ImageView diceImageView = findViewById(R.id.imageView);
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wylosowanaLiczba = (int)(Math.random()*6+1);
                diceTextView.setText(wylosowanaLiczba.toString());
                diceImageView.setImageResource(dices.get(wylosowanaLiczba-1));
            }
        });
    }
}