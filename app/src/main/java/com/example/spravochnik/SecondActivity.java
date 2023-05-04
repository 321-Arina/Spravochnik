package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Insect> animals = new ArrayList<Insect>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        InsectAdapter adapter = new InsectAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Insect("Клоп Пикассо", "Клоп или жук Пикассо – это насекомое, которое использует свои характерные яркие отметины, чтобы предупредить хищников, чтобы они держались от него подальше.",
                R.drawable.clop, "Тропическая Африка"));
        animals.add( new Insect("Восточноафриканский богомол", "Колючий, цветочный богомол явно любит похвастаться. С зелеными, розовыми, желтыми и красными вариациями, этот вид является каннибалом и питается, в основном, пойманными насекомыми.",
                R.drawable.bogomol, "Южная и Восточная Африка"));
        animals.add( new Insect("Прибрежный паук-павлин", "Эти красавцы живут только в растительности прибрежных песчаных дюн юго-западной части Западной Австралии. Длина паука от 3,35 до 3,72 мм.",
                R.drawable.pauk, "Южная Австралия"));
        animals.add( new Insect("Красный драгоценный жук", "«Драгоценные жуки» обитают во всех уголках мира. Удивительно, но эти жуки могут использовать яркие цвета как камуфляж, а не как предупреждающий знак.",
                R.drawable.zuk, "Таиланд"));
        animals.add( new Insect("Оса-блестянка", "Эти крошечные, радужные красавицы – не жалят. Вместо этого, они паразитируют на других осах.",
                R.drawable.osa, "По всему миру, кроме Антарктиды"));
    }
}