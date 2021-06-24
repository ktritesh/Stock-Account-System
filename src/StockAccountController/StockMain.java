package StockAccountController;

import StockAccountModel.StockAccount;
import StockAccountService.StockService;
import StockAccountService.StockServiceInterface;
import util.UserInputOutput;

import java.util.Scanner;

public class StockMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StockServiceInterface stockService = new StockService();

        boolean flag = true;
        while (flag){
            int choice = UserInputOutput.showMenu();
            switch (choice){
                case 1:
                    StockAccount stockAccount = setStockProperties();
                    stockService.insertShare(stockAccount);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    stockService.printStockReport();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
        }
    }

    public static StockAccount setStockProperties() {

        StockAccount stockAccount = new StockAccount();

        int numberOfShares = UserInputOutput.getNumberOfShares();
        stockAccount.setNumberOfShares(numberOfShares);

        String name = UserInputOutput.getStockName();
        stockAccount.setName(name);

        int price = UserInputOutput.getStockPrice();
        stockAccount.setPrice(price);

        return stockAccount;
    }
}
