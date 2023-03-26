package com.bookmanager.bookmanagerspringui.Entity;

import java.util.Date;

public class Book {

    private String isbn;
    private String title;
    private Date publishedDate;
    private String description;
    private String image;
    private String autori;

    public Book(String isbn, String title, Date publishedDate, String description, String image, String autori) {
        this.isbn = isbn;
        this.title = title;
        this.publishedDate = publishedDate;
        if (description == null || description.equals("")) {
            this.description = "Nessuna descrizione";
        } else {
            this.description = description;
        }
        this.image = image;
        this.autori = autori;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public String getDescription() {
        return description;
    }


    public String getImage() {
        return image;
    }

    public String getAutori() {
        return autori;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", publishedDate=" + publishedDate +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", autori='" + autori + '\'' +
                '}';
    }
}

