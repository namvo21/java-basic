package exercise10;

import utils.BookFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagementFactory {
    public static void main(String[] args) {
        int userInput;
        int MAX_INPUT_TIMES = 3;
        int tryAgain = 0;
        boolean isContinuing = true;
        String filePath = System.getProperty("user.dir") + "/books.txt";
        List<BookExercise> bookExerciseList = new ArrayList<>();

        while(isContinuing){

            System.out.println("=========Book Management=============");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve Book");
            System.out.println("0. Exit !");

            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();

            if(userInput == 1)
                BookFactory.addBook(bookExerciseList,filePath);
            else if(userInput == 2){
                System.out.println("Input your Book ID");
                int iSBN = scanner.nextInt();
                for (BookExercise bookExercise : bookExerciseList) {
                    if(bookExercise.getISBN() == iSBN){
                        BookFactory.retrieveBook(filePath);
                        System.out.println("Your book information is ISBN: " + bookExercise.getISBN() + " - Book Title: " + bookExercise.getBookTitle() + " - Book Author: "+ bookExercise.getBookAuthor() + " - Book Year: " + bookExercise.getBookYear());
                    }
                }
            }
            else if (userInput == 0)
                isContinuing = false;
            else {
                System.out.println("Your option is not available");
                tryAgain++;
                if (tryAgain == MAX_INPUT_TIMES)
                    break;
            }
        }
    }
}
