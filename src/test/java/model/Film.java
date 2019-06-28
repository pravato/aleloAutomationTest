package model;

public class Film {

    private String name;
    private int year;
    private Director director;

    public Director getDirector() {
        return director;
    }

    public Film(String name, int year, Director director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return director.getName().concat(" ").concat(getName());
    }
}
