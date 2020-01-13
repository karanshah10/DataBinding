package com.example.apple.databinding3.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.apple.databinding3.BR;

import java.util.Date;

/**
 * Created by Apple on 6/20/2017.
 */

public class Movie extends BaseObservable {
    private String genre;
    private String imgUrl;
    private Date publicationDate;
    private String title;

    public Movie() {
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public Movie setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
        return this;
    }

    @Bindable
    public String getImgUrl() {
        return imgUrl;
    }

    public Movie setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        notifyPropertyChanged(BR.imgUrl);
        return this;
    }

    @Bindable
    public Date getPublicationDate() {
        return publicationDate;
    }

    public Movie setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
        notifyPropertyChanged(BR.publicationDate);
        return this;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
        return this;
    }
}
