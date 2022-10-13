package com.example.dice3pgr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<ImageView> dicesView = new ArrayList<>();
    private final ArrayList<Dice> dices = new ArrayList<>();

    public void rollDice() {
        if (dices.size() == 0)
            for (int i = 0; i < dicesView.size(); i++) {
                Dice dice = new Dice();
                dices.add(dice);
                dicesView.get(i).setImageResource(dice.getIdImage());
            }
        else
            for (int i = 0; i < dicesView.size(); i++)
                if (!dices.get(i).isClicked()) {
                    Dice dice = new Dice();
                    dices.set(i, dice);
                    dicesView.get(i).setImageResource(dice.getIdImage());
                }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button diceButton = findViewById(R.id.button);

        dicesView.add(findViewById(R.id.imageView1));
        dicesView.add(findViewById(R.id.imageView2));
        dicesView.add(findViewById(R.id.imageView3));
        dicesView.add(findViewById(R.id.imageView4));
        dicesView.add(findViewById(R.id.imageView5));

        rollDice();

        diceButton.setOnClickListener(v -> rollDice());

        for (int i = 0; i < dicesView.size(); i++) {
            int finalI = i;
            dicesView.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Clicked " + finalI + " " + dices.get(finalI).isClicked(), Toast.LENGTH_SHORT).show();
                    if (dices.get(finalI).isClicked()) {
                        dices.get(finalI).setClicked(false);
                        dicesView.get(finalI).setImageAlpha(255);
                    }
                    else {
                        dices.get(finalI).setClicked(true);
                        dicesView.get(finalI).setImageAlpha(50);
                    }
                }
            });
        }
    }
}