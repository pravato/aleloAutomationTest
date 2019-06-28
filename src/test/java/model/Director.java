package model;

public class Director {

    private String name;
    private int year;

    public Director(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
