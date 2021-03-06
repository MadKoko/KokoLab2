package it.polito.mad.koko.kokolab2.books;

import java.io.Serializable;

/**
 * Created by Francesco on 10/04/2018.
 */

public class Book implements Serializable {

    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private String editionYear;
    private String conditions;
    private String uid;

    public Book(){};

    public Book(String ISBN, String title, String author, String publisher, String editionYear, String bookConditions, String uid) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.editionYear = editionYear;
        this.conditions = bookConditions;
        this.uid=uid;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(String editionYear) {
        this.editionYear = editionYear;
    }

    public String getBookConditions() {
        return conditions;
    }

    public void setBookConditions(String bookConditions) {
        this.conditions = bookConditions;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", editionYear='" + editionYear + '\'' +
                ", bookConditions='" + conditions + '\'' +
                ", userId='" + uid + '\'' +
                '}';
    }


}

