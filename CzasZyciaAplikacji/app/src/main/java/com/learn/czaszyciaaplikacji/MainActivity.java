package com.learn.czaszyciaaplikacji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer licznik = 0;
    public TextView licznikTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        licznikTextView = findViewById(R.id.licznikTextView);
        Log.i("CzasZycia","wywołana metoda onCreate");
        if(savedInstanceState!=null){
            licznik = savedInstanceState.getInt("Licznik",0);
            licznikTextView.setText(licznik.toString());
            Log.i("czas zycia","wywołana metoda onSaveInstanceState");
        }

    }
    public void zwieksz(View view){
        licznik++;
        licznikTextView.setText(licznik.toString());
    }
    public void zmiejsz(View view){
        licznik--;
        licznikTextView.setText(licznik.toString());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
         outState.putInt("Licznik",licznik);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CzasZycia","wywołana metoda onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CzasZycia","wywołana metoda onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CzasZycia","wywołana metoda onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CzasZycia","wywołana metoda onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CzasZycia","wywołana metoda onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CzasZycia","wywołana metoda onDestroy");
    }
}