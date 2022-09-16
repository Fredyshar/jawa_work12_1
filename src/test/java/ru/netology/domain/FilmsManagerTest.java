package ru.netology.domain;//------------------------------------------------------------------------------


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmsManager;
import ru.netology.domain.PosterFilms;

import java.util.Arrays;

public class FilmsManagerTest {

    FilmsManager manager = new FilmsManager();

    @Test
    public void findAll() {                                             // вывод всех фильмов в порядке добавления + добавление
        FilmsManager manager = new FilmsManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11", "film12"};
        String[] actual = manager.findALL();

        Assertions.assertArrayEquals(expected, actual);
        //        System.out.println(Arrays.toString(expected));
        //        System.out.println(Arrays.toString(actual));

    }

    @Test
    public void amoutnUnknowna() {                      // вывод всех фильмов в обратном порядке с лимитом по умолчанию 10 единиц
        FilmsManager manager = new FilmsManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");

        String[] expected = {"film12", "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
        //       System.out.println(Arrays.toString(expected));
        //       System.out.println(Arrays.toString(actual));
    }

    @Test
    public void moutnKnown() {                          // вывод всех фильмов в обратном порядке с лимитом вручную
        FilmsManager manager = new FilmsManager(5);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");

        String[] expected = {"film12", "film11", "film10", "film9", "film8"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
        //       System.out.println(Arrays.toString(expected));
        //       System.out.println(Arrays.toString(actual));

    }

}

//---------------------------------------------------------------------------------------------------------------

//package ru.netology.domain;//
//
//
//        import org.junit.jupiter.api.Assertions;
//        import org.junit.jupiter.api.Test;
//        import ru.netology.domain.FilmsManager;
//        import ru.netology.domain.PosterFilms;
//
//        import java.beans.Transient;
//        import java.util.ArrayList;
//        import java.util.Arrays;
//
//public class FilmsManagerTest {
//
//    FilmsManager manager = new FilmsManager();
//
//    PosterFilms poster1 = new PosterFilms(1, "Блэдшот", "Боевик", "12.03.2022");
//    PosterFilms poster2 = new PosterFilms(2, "Вперед", "Мультфильм", "05.03.2022");
//    PosterFilms poster3 = new PosterFilms(3, "Отель Белград", "Комедия", "05.03.2022");
//    PosterFilms poster4 = new PosterFilms(4, "Джентельмены", "Боевик", "13.02.2022");
//    PosterFilms poster5 = new PosterFilms(5, "Человек-невидимка", "Ужасы", "05.03.2022");
//    PosterFilms poster6 = new PosterFilms(6, "Троллию Мировой тур", "Мультфильм", "19.03.2022");
//    PosterFilms poster7 = new PosterFilms(7, "Номер один", "Комедия", "19.03.2022");
//    PosterFilms poster8 = new PosterFilms(8, "Номер два", "Комедия", "20.03.2023");
//    PosterFilms poster9 = new PosterFilms(9, "Номер три", "Комедия", "19.09.2023");
//    PosterFilms poster10 = new PosterFilms(10, "Номер четыре", "Комедия", "05.01.2024");
//    PosterFilms poster11 = new PosterFilms(11, "Снова номер 1", "Комедия", "12.07.2024");
//    PosterFilms poster12 = new PosterFilms(12, "И вновь номер 2", "Драма", "01.05.2025");
//
//    @Test
//    public void findAll() {                                             // вывод всех фильмов в порядке добавления + добавление
//        FilmsManager manager = new FilmsManager();
//        manager.add(poster1);
//        manager.add(poster2);
//        manager.add(poster3);
//        manager.add(poster4);
//        manager.add(poster5);
//        manager.add(poster6);
//        manager.add(poster7);
//
//
//        PosterFilms[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7};
//        PosterFilms[] actual = manager.findALL();
//
//        Assertions.assertArrayEquals(expected, actual);
//        System.out.println(Arrays.deepToString(expected));
//        System.out.println(Arrays.deepToString(actual));
//        System.out.println(poster1);
//        System.out.println(Arrays.asList(poster1));
//
//    }
//
//    @Test
//    public void findLast() {                                             // вывод всех фильмов в порядке добавления + добавление
//        FilmsManager manager = new FilmsManager();
//        manager.add(poster1);
//        manager.add(poster2);
//        manager.add(poster3);
//        manager.add(poster4);
//        manager.add(poster5);
//        manager.add(poster6);
//        manager.add(poster7);
//        PosterFilms[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
//        PosterFilms[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
////        System.out.println(Arrays.toString(expected));
////        System.out.println(Arrays.toString(actual));
//
//    }
//
//    @Test
//    public void amoutnUnknowna() {                      // вывод всех фильмов в обратном порядке с лимитом по умолчанию 10 единиц
//        FilmsManager manager = new FilmsManager();
//        manager.add(poster1);
//        manager.add(poster2);
//        manager.add(poster3);
//        manager.add(poster4);
//        manager.add(poster5);
//        manager.add(poster6);
//        manager.add(poster7);
//        manager.add(poster8);
//        manager.add(poster9);
//        manager.add(poster10);
//        manager.add(poster11);
//        manager.add(poster12);
//
//
//        PosterFilms[] expected = {poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3};
//        PosterFilms[] actual = manager.findLast();
////        System.out.println(Arrays.toString(expected));
////        System.out.println(Arrays.toString(actual));
//
//    }
//
//    @Test
//    public void moutnKnown() {                              // вывод всех фильмов в обратном порядке с лимитом вручную
//        FilmsManager manager = new FilmsManager(5);
//        manager.add(poster1);
//        manager.add(poster2);
//        manager.add(poster3);
//        manager.add(poster4);
//        manager.add(poster5);
//        manager.add(poster6);
//        manager.add(poster7);
//        manager.add(poster8);
//        manager.add(poster9);
//        manager.add(poster10);
//        manager.add(poster11);
//        manager.add(poster12);
//
//        PosterFilms[] expected = {poster12, poster11, poster10, poster9, poster8};
//        PosterFilms[] actual = manager.findLast();
////        System.out.println(Arrays.toString(expected));
////        System.out.println(Arrays.toString(actual));
//
//    }
//
//
//}
