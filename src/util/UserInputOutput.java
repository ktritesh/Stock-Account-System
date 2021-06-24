package util;

import java.util.Scanner;

public class UserInputOutput {
    static Scanner scanner = new Scanner(System.in);

    public static int showMenu() {

        System.out.println();
        System.out.println("Choose option from below");
        System.out.println("1. Insert Stock");
        System.out.println("2. Buy Stock");
        System.out.println("3. Sell Stock");
        System.out.println("4. Print the stock Report");
        System.out.println("5. Calculate particular stock value");
        System.out.println("6. Calculate total Stock value");
        System.out.println("7. Exit");

        return scanner.nextInt();
    }

    public static int getNumberOfShares(){
        System.out.println("Enter the number of stocks : ");
        return scanner.nextInt();
    }

    public static String getStockName(){
        System.out.println("Enter the name : ");
        return scanner.next();
    }

    public static int getStockPrice(){
        System.out.println("Enter the price : ");
        return scanner.nextInt();
    }
}
