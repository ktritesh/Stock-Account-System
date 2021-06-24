package dao;

import StockAccountModel.StockAccount;
import StockAccountService.StockServiceInterface;

import java.util.ArrayList;
import java.util.List;

public class StockDAO implements StockServiceInterface {
    List<StockAccount> stockAccountList = new ArrayList<>();

    @Override
    public void insertShare(StockAccount stockAccount) {
        stockAccountList.add(stockAccount);
    }

    @Override
    public void buyShare(String name, int numberOfShares, StockAccount stockAccount) {

    }

    @Override
    public void sellShare(String name, int numberOfShares, StockAccount stockAccount) {

    }

    @Override
    public void printStockReport() {
        for (int i = 0; i < stockAccountList.size(); i++){
            System.out.println(stockAccountList.get(i));
            int numberOfShares = stockAccountList.get(i).getNumberOfShares();
            String name = stockAccountList.get(i).getName();
            int price = stockAccountList.get(i).getPrice();
        }
    }

    @Override
    public void calculateParticularStockValue(StockAccount stockAccount, String name) {

    }

    @Override
    public void calculateTotalStockValue(StockAccount stockAccount) {

    }
}
