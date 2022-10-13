package com.example.dice3pgr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Integer wylosowanaLiczba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button diceButton = findViewById(R.id.button);
        TextView diceTextView = findViewById(R.id.textView);
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wylosowanaLiczba = (int)(Math.random()*6+1);
                diceTextView.setText(wylosowanaLiczba.toString());
            }
        });
    }
}