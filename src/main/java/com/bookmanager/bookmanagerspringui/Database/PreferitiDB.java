package com.bookmanager.bookmanagerspringui.Database;

import com.bookmanager.bookmanagerspringui.Entity.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreferitiDB extends DatabaseConnection {


    public PreferitiDB() throws SQLException {
        super();
    }

    public ArrayList<Book> getAllBook() throws SQLException {
        ResultSet result = super.executeQuery("SELECT bs.isbn, b.title, b.publishedDate, CAST(b.description AS nvarchar(max)) as description, b.image, b.autori as autori, COUNT(*) as occurrences\n" +
                "FROM bookStarred bs\n" +
                "INNER JOIN book b ON bs.isbn = b.isbn\n" +
                "GROUP BY bs.isbn, b.title, b.publishedDate, CAST(b.description AS nvarchar(max)), CAST(b.autori AS nvarchar(max)), b.autori, b.image\n" +
                "ORDER BY occurrences DESC");
        ArrayList<Book> books = new ArrayList<>();
        while (result.next()) {
            books.add(new Book(result.getString("isbn"), result.getString("title"), result.getDate("publishedDate"), result.getString("description"), result.getString("image"), result.getString("autori")));
        }
        return books;
    }

}
