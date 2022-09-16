package ru.netology.domain;

public class PosterFilms {

    public int id;
    public String nameTitle;
    public String filmGenre;
    public String premierDate;


    public PosterFilms(int id, String nameTitle, String filmGenre, String premierDate) {
        this.id = id;
        this.nameTitle = nameTitle;
        this.filmGenre = filmGenre;
        this.premierDate = premierDate;

    }

    public int getId() {
        return id;
    }
    public String getNameTitle() {
        return nameTitle;
    }
}