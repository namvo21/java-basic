package utils;

import lesson10.Book;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static void addBook(List<Book> bookList, String filePath){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            ){
            for (Book book : bookList) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();;
        }
    }

    public static List<Book> retrieveBook(String filePath){
        List<Book> bookList = new ArrayList<>();
        try(
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ){
            String dataLine = bufferedReader.readLine();
            while(dataLine != null){
                String [] bookData = dataLine.split(";");
                int ISBN = Integer.parseInt(bookData[0]);
                String title = bookData[1];
                String author = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                bookList.add(new Book(ISBN, title, author, year));
                dataLine = bufferedReader.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return bookList;
    }
}
