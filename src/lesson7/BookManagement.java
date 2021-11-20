package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement extends Book{
    static  List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {


        int userInput;
        int MAX_INPUT_TIMES = 3;
        int tryAgain = 0;
        boolean isContinuing = true;

        while(isContinuing){

            System.out.println("=========Book Management=============");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve Book");
            System.out.println("0. Exit !");

            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();

            if(userInput == 1)
                AddBook();
            else if(userInput == 2)
                RetrieveBook();
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

    public static void AddBook() {
        System.out.println("Input your Book ID");

        Scanner scanner = new Scanner(System.in);
        int iSBN = scanner.nextInt();

        System.out.println("Input your Book Title");
        String bookTitle = scanner.next();

        System.out.println("Input your Book Author");
        String bookAuthor = scanner.next();

        System.out.println("Input your Book Year");
        int bookYear = scanner.nextInt();

        Book book = new Book(iSBN, bookTitle, bookAuthor, bookYear);

        bookList.add(book);
    }

    public static void RetrieveBook() {
        int iSBN;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Book ID");

        iSBN = scanner.nextInt();

        for (Book book : bookList) {
            if(book.getISBN() == iSBN)
                System.out.println("Your book information is ISBN: " + book.getISBN() + " - Book Title: " + book.getTitle() + " - Book Author: "+ book.getAuthor() + " - Book Year: " + book.getYear());
            else
                System.out.println("Your book is not available");
                break;
        }
    }
}
