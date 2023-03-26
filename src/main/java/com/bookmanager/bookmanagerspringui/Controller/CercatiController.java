package com.bookmanager.bookmanagerspringui.Controller;

import com.bookmanager.bookmanagerspringui.Database.RankingDB;
import com.bookmanager.bookmanagerspringui.Entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping("/cercati")
public class CercatiController {
    private static final Logger logger = LoggerFactory.getLogger(CercatiController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String ciao(Model theModel) throws SQLException {
        RankingDB db = new RankingDB();
        ArrayList<Book> books = db.getAllBook();
        theModel.addAttribute("books", books);
        books.forEach(book -> {
            logger.info(book.toString());
        });
        return "piucercati";
    }
}
