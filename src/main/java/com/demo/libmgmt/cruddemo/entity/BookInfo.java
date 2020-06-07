package com.demo.libmgmt.cruddemo.entity;

import java.util.Objects;

/**
 * Book info model
 */
public class BookInfo {
    private String isbn;
    private String title;
    private String genre;
    private String authLastName;
    private String authFirstName;
    private String publisher;
    private Integer yearPub;
    private String pubLanguage;

    public BookInfo() {
    }

    public BookInfo(String isbn, String title, String genre, String authLastName, String authFirstName, String publisher, Integer yearPub, String pubLanguage) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.authLastName = authLastName;
        this.authFirstName = authFirstName;
        this.publisher = publisher;
        this.yearPub = yearPub;
        this.pubLanguage = pubLanguage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthLastName() {
        return authLastName;
    }

    public void setAuthLastName(String authLastName) {
        this.authLastName = authLastName;
    }

    public String getAuthFirstName() {
        return authFirstName;
    }

    public void setAuthFirstName(String authFirstName) {
        this.authFirstName = authFirstName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getYearPub() {
        return yearPub;
    }

    public void setYearPub(Integer yearPub) {
        this.yearPub = yearPub;
    }

    public String getPubLanguage() {
        return pubLanguage;
    }

    public void setPubLanguage(String pubLanguage) {
        this.pubLanguage = pubLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookInfo bookInfo = (BookInfo) o;
        return isbn.equals(bookInfo.isbn) &&
                title.equals(bookInfo.title) &&
                Objects.equals(genre, bookInfo.genre) &&
                Objects.equals(authLastName, bookInfo.authLastName) &&
                Objects.equals(authFirstName, bookInfo.authFirstName) &&
                publisher.equals(bookInfo.publisher) &&
                Objects.equals(yearPub, bookInfo.yearPub) &&
                pubLanguage.equals(bookInfo.pubLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, genre, authLastName, authFirstName, publisher, yearPub, pubLanguage);
    }
}
