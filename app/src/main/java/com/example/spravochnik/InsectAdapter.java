package com.example.spravochnik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InsectAdapter extends RecyclerView.Adapter<InsectAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Insect> insect; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public InsectAdapter(Context context, List<Insect> insect) {
        this.inflater = LayoutInflater.from(context);
        this.insect = insect;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public InsectAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(InsectAdapter.ViewHolder holder, int position) {
        Insect animal = insect.get(position);
        holder.insectView.setImageResource(animal.getInsectResource());
        holder.nameView.setText(animal.getName());
        holder.insectDescriptionView.setText(animal.getInsectDescription());
        holder.populationSizeView.setText(animal.getPopulationSize());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return insect.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView insectView;
        final TextView nameView, insectDescriptionView, populationSizeView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            insectView = view.findViewById(R.id.insectResource);
            nameView = view.findViewById(R.id.name);
            insectDescriptionView = view.findViewById(R.id.insectDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}
