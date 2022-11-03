package com.learn.penguingallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> images = new ArrayList<>();
    ImageView imageView;
    int index = 0;

    Button nextButton;
    Button prevButton;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i <= 7; i++)
            images.add(getResources().getIdentifier("penguin" + i, "drawable", getPackageName()));

        imageView = findViewById(R.id.imageView);

        nextButton = findViewById(R.id.next);
        prevButton = findViewById(R.id.prev);

        nextButton.setOnClickListener(v -> {
            index = (index + 1) % images.size();
            imageView.setImageResource(images.get(index));
        });
        prevButton.setOnClickListener(v -> {
            index = (index - 1 + images.size()) % images.size();
            imageView.setImageResource(images.get(index));
        });

        editText = findViewById(R.id.inputImage);
        editText.setOnEditorActionListener((v, actionId, event) -> {
            index = Integer.parseInt(editText.getText().toString()) - 1 % images.size();
            imageView.setImageResource(images.get(index));
        });
        +

    }
}

/*
Na obrazach 1a i 1b przedstawiono stan początkowy aplikacji mobilnej. W zależności od użytego środowiska programistycznego
oraz emulowanego systemu wynik końcowy może nieznacznie się różnić.
Opis wyglądu i działania aplikacji
‒ Napis „Galeria”
‒ Poniżej obszar do przeglądania zdjęć z domyślnie załadowanym obrazem kot1.jpg. Kolejność wyświetlania zdjęć to
kot1, kot2, kot3, kot4, kot1 (zdjęcia wyświetlają się w karuzeli)
‒ Poniżej przycisk PREV, którego wybranie powoduje zamianę zdjęcia na poprzednie, np. 1 na 4; 4 na 3 i tak dalej
‒ Obok przycisk NEXT, którego wybranie powoduje zamianę zdjęcia na następne, np. 1 na 2; 4 na 1
‒ Poniżej pole edycyjne poprzedzone napisem: „Który obraz wyświetlić?”. Wpisanie liczby 1-4 powoduje wyświetlenie
odpowiedniego obrazu: 1 dla kot1, 2 dla kot2 i tak dalej. Wpisanie dowolnego innego znaku jest ignorowane – aplikacja
nie wywołuje błędu działania
‒ Poniżej przełącznik (switch) poprzedzony napisem: „Tło niebieskie?”. Zaznaczenie jego powoduje zmianę tła aplikacji
na kolor niebieski. Odznaczenie – powrót do koloru zielonego
‒ Na dole podpis o treści: „Autor: ”, dalej wstawiony numer PESEL zdającego
Założenia aplikacji
‒ Obrazy kotów przechowywane w zasobach aplikacji
‒ Interfejs użytkownika zapisany za pomocą języka znaczników wspieranego w danym środowisku (np. XAML, XML)
‒ Zastosowany typ rozkładu: liniowy (Linear / Stack) lub względny (Relative), elementy rozkładu nie mogą na siebie
nachodzić
‒ Zastosowane kolory tła: #00796B, #004C40, #1565c0, według wzoru na obrazie 1a
‒ Zastosowane kolory czcionki: czarny i biały, według wzoru na obrazie 1a
‒ Obraz jest rozciągnięty (wypełnia) cały obszar ekranu w poziomie
‒ Czcionka napisu „Galeria” jest wizualnie większa od pozostałych
‒ Przyciski są umieszczone poziomo obok siebie i przylegają do krańców ekranu po lewej lub prawej stronie
‒ Do pola edycyjnego można wpisać jedynie liczby
‒ Działanie kontrolek obsłużone za pomocą zdarzeń lub techniką Data Binding
‒ Aplikacja powinna być zapisana czytelnie, z zasadami czystego formatowania kodu, stosować znaczące nazwy
zmiennych i funkcji
‒ Dokumentacja do programu powinna być wykonana zgodnie z wytycznymi z części III zadania egzaminacyjnego
Kod aplikacji (cały projekt) przygotuj do nagrania na płytę (skopiuj do podfolderu mobilna).
 */