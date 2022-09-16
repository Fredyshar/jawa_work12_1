package ru.netology.domain;

public class FilmsManager {

    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findALL() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }


        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}

//---------------------------------------------------------------------------------------------------------------

//package ru.netology.domain;
//
//public class FilmsManager {
//
//    private PosterFilms[] films = new PosterFilms[0];
//    private int limit;
//
//    public FilmsManager() {
//        this.limit = 10;
//    }
//
//    public FilmsManager(int limit) {
//        this.limit = limit;
//    }
//
//    public void add(PosterFilms film) {
//        PosterFilms[] tmp = new PosterFilms[films.length + 1];
//        for (int i = 0; i < films.length; i++) {
//            tmp[i] = films[i];
//        }
//        tmp[tmp.length - 1] = film;
//        films = tmp;
//    }
//
//    public PosterFilms[] findALL() {
//        return films;
//    }
//
//    public PosterFilms[] findLast() {
//        int resultLenght;
//        if (films.length < limit) {
//            resultLenght = films.length;
//        } else {
//            resultLenght = limit;
//        }
//
//
//        PosterFilms[] tmp = new PosterFilms[resultLenght];
//        for (int i = 0; i < tmp.length; i++) {
//            tmp[i] = films[films.length - 1 - i];
//        }
//        return tmp;
//    }
//}












