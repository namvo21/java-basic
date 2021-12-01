package lesson10;

import utils.DataFactory;

import java.util.ArrayList;
import java.util.List;

public class TestDataFactory {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"Selenium","Nam Vo", 2021));
        bookList.add(new Book(2,"Appium","Luan Pham", 2021));

        String filePath = System.getProperty("user.dir") + "/books.txt";

        DataFactory.addBook(bookList, filePath);
        List<Book> savedBookList = DataFactory.retrieveBook(filePath);
        for (Book book : savedBookList) {
            System.out.println(book);
        }
    }
}
