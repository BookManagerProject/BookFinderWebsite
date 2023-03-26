package com.bookmanager.bookmanagerspringui.Controller;

import com.bookmanager.bookmanagerspringui.Database.PreferitiDB;
import com.bookmanager.bookmanagerspringui.Entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.ArrayList;

;

@Controller
@RequestMapping("/preferiti")
public class PreferitiController {
    private static final Logger logger = LoggerFactory.getLogger(PreferitiController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String ciao(Model theModel) throws SQLException {
        PreferitiDB db = new PreferitiDB();
        ArrayList<Book> books = db.getAllBook();
        theModel.addAttribute("books", books);
        books.forEach(book -> {
            logger.info(book.toString());
        });
        return "preferiti";
    }
}
