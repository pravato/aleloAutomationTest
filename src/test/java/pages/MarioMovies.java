package pages;
import model.Director;
import model.Film;

import java.util.ArrayList;

public class MarioMovies {

    public static ArrayList<Film> films = new ArrayList<Film>() {{
        add(new Film("O Senhor dos Anéis", 2001, new Director("Peter Jackson", 1961)));
        add(new Film("O Resgate do Soldado Ryan", 1998, new Director("Steven Spielberg", 1946)));
        add(new Film("Ilha do Medo", 2010, new Director("Martin Scorsese", 1942)));
    }};

}
