package com.example.spravochnik;

public class Insect {

    // поля сущности
    private String name; // поле названия животного
    private String insectDescription; // поле описания животного
    private int insectResource; // поле ресурса животного
    private String populationSize; // поле численности популяции

    // конструктор
    public Insect(String name, String animalDescription, int animalResource, String populationSize) {
        this.name = name;
        this.insectDescription = animalDescription;
        this.insectResource = animalResource;
        this.populationSize = populationSize;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInsectDescription() {
        return insectDescription;
    }

    public void setInsectDescription(String animalDescription) {
        this.insectDescription = animalDescription;
    }

    public int getInsectResource() {
        return insectResource;
    }

    public void setInsectResource(int animalResource) {
        this.insectResource = animalResource;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}
