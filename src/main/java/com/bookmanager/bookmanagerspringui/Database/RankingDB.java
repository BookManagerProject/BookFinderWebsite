package com.bookmanager.bookmanagerspringui.Database;

import com.bookmanager.bookmanagerspringui.Entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RankingDB extends DatabaseConnection {


    public RankingDB() throws SQLException {
        super();
    }

    public ArrayList<Book> getAllBook() throws SQLException {
        ResultSet result = super.executeQuery("SELECT b.isbn, b.title, b.publishedDate, b.description, b.image, b.autori, sb.counter\n" +
                "FROM searchedBook sb\n" +
                "INNER JOIN book b ON sb.isbn = b.isbn\n" +
                "ORDER BY sb.counter DESC;\n");
        ArrayList<Book> books = new ArrayList<>();
        while (result.next()) {
            books.add(new Book(result.getString("isbn"), result.getString("title"), result.getDate("publishedDate"), result.getString("description"), result.getString("image"), result.getString("autori"), result.getInt("counter")));
        }
        return books;
    }

}
