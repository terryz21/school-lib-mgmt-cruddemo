package com.demo.libmgmt.cruddemo.entity;

import java.util.Objects;

public class Book {
    enum BookType {
        SOFTCOVER,
        HARDCOVER,
        EBOOK
    }

    enum BookCondition {
        NEW,
        GOOD,
        SATISFACTORY,
        DAMAGED
    }

    private String bid;
    private String isbn;
    private BookType bookType;
    private Boolean isCheckedOut;
    private BookCondition bookCondition;

    public Book() {}

    public Book(String bid, String isbn, BookType bookType, Boolean isCheckedOut, BookCondition bookCondition) {
        this.bid = bid;
        this.isbn = isbn;
        this.bookType = bookType;
        this.isCheckedOut = isCheckedOut;
        this.bookCondition = bookCondition;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public BookCondition getBookCondition() {
        return bookCondition;
    }

    public void setBookCondition(BookCondition bookCondition) {
        this.bookCondition = bookCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bid.equals(book.bid) &&
                isbn.equals(book.isbn) &&
                bookType == book.bookType &&
                isCheckedOut.equals(book.isCheckedOut) &&
                bookCondition == book.bookCondition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, isbn, bookType, isCheckedOut, bookCondition);
    }
}
