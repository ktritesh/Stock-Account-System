package StockAccountService;

import StockAccountModel.StockAccount;
import dao.StockDAO;

public class StockService implements StockServiceInterface {
    StockDAO stockDAO = new StockDAO();

    @Override
    public void insertShare(StockAccount stockAccount) {
        stockDAO.insertShare(stockAccount);
    }

    @Override
    public void buyShare(String name, int numberOfShares, StockAccount stockAccount) {
        stockDAO.buyShare(name, numberOfShares, stockAccount);
    }

    @Override
    public void sellShare(String name, int numberOfShares, StockAccount stockAccount) {
        stockDAO.sellShare(name, numberOfShares, stockAccount);
    }

    @Override
    public void printStockReport() {
        stockDAO.printStockReport();
    }

    @Override
    public void calculateParticularStockValue(StockAccount stockAccount, String name) {
        stockDAO.calculateParticularStockValue(stockAccount, name);
    }

    @Override
    public void calculateTotalStockValue(StockAccount stockAccount) {
        stockDAO.calculateTotalStockValue(stockAccount);
    }
}
