package lesson3;

import java.util.Scanner;

public class UrlChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap URL");
        String url = scanner.next();

        String [] splitStr = url.split("://");

        String urlMethod = splitStr[0];
        String domainName = splitStr[1];

        if(urlMethod.contains("https")){
            System.out.println("This is https");
        }else if (url.contains("http")) {
            System.out.println("This is http");
        }

        if(domainName.contains(".com")){
            System.out.println("This is .com");
        }else if (url.contains(".net")){
            System.out.println("This is .net");
        }
    }
}
