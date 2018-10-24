package com.feveraer.stateless;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote {

    List<String> bookShelf;
    
    public LibrarySessionBean() {
        bookShelf = new ArrayList<>();
    }
    
    @Override
    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    @Override
    public List getBooks() {
        return bookShelf;
    }
}
