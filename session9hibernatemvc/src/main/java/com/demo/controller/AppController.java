package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.demo.dao.BookDAO;
import com.demo.model.Book;

 
@Controller

public class AppController {
 
    @Autowired
   private BookDAO dao;
     
    
 
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String newBook() {
 
     //   List<Book> books = service.findAllBooks();
      //  model.addAttribute("books", books);
        return "addBook";
    }
 
    /*
     * This method will provide the medium to add a new employee.
     */
    @RequestMapping(value="/addBook", method = RequestMethod.GET)
    public String newBook(@ModelAttribute("book") Book book,ModelMap model) 
    {
    dao.addBook(book);
       return "success";
    }
 
  
 
}
