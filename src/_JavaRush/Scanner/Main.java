package _JavaRush.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String s1 = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        String s2 = scan2.nextLine();
        Scanner scan3 = new Scanner(System.in);
        String s3 = scan3.nextLine();

        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}