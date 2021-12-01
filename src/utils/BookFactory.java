package utils;

import exercise10.BookExercise;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFactory {

    public static void addBook(List<BookExercise> bookExercisesList, String filePath){
        List<BookExercise> bookListExercise = new ArrayList<>();

        System.out.println("Input your Book ID");

        Scanner scanner = new Scanner(System.in);
        int iSBN = scanner.nextInt();

        System.out.println("Input your Book Title");
        String bookTitle = scanner.next();

        System.out.println("Input your Book Author");
        String bookAuthor = scanner.next();

        System.out.println("Input your Book Year");
        int bookYear = scanner.nextInt();

        BookExercise bookExercise = new BookExercise(iSBN, bookTitle, bookAuthor, bookYear);

        bookExercisesList.add(bookExercise);

        try(
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            ){
            for (BookExercise exercise : bookExercisesList) {
                String dataLine = exercise.getISBN() + ";" + exercise.getBookTitle() + ";" + exercise.getBookAuthor() + ";" + exercise.getBookYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();;
        }
    }

    public static List<BookExercise> retrieveBook(String filePath){
        List<BookExercise> bookListExercise = new ArrayList<>();

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
                bookListExercise.add(new BookExercise(ISBN, title, author, year));
                dataLine = bufferedReader.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return bookListExercise;
    }
}
