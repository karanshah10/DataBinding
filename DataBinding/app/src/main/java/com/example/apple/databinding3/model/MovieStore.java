package com.example.apple.databinding3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Apple on 6/20/2017.
 */

public class MovieStore {

    private static List<Movie> ALL_MOVIES;

    public static List<Movie> getAllMovies() {
        return ALL_MOVIES;
    }
    static{
        ALL_MOVIES = new ArrayList<>(20);
        ALL_MOVIES
                .add(new Movie().setTitle("Marvel's The Avengers 2: Age of Ultron").setGenre("Action")
                        .setPublicationDate(new Date(1430438400000L)).setImgUrl(
                                "http://i.imgur.com/DvpvklR.png"));
        ALL_MOVIES.add(new Movie().setTitle("The Amazing Spider-Man").setGenre("Action")
                .setPublicationDate(new Date(1341360000000L))
                .setImgUrl("http://i.imgur.com/DvpvklR.png"));
        ALL_MOVIES.add(new Movie().setTitle("Terminator 2: Judgment Day").setGenre("Action")
                .setPublicationDate(new Date(678326400000L))
                .setImgUrl("http://i.imgur.com/DvpvklR.png"));
        ALL_MOVIES.add(new Movie().setTitle("From Dusk Till Dawn").setGenre("Horror")
                .setPublicationDate(new Date(821923200000L))
                .setImgUrl("http://i.imgur.com/DvpvklR.png"));
        ALL_MOVIES.add(new Movie().setTitle("Shaun the Sheep Movie").setGenre("Family")
                .setPublicationDate(new Date(1423180800000L))
                .setImgUrl("http://i.imgur.com/DvpvklR.png"));
    }
}
