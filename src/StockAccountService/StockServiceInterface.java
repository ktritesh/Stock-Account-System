package StockAccountService;

import StockAccountModel.StockAccount;

public interface StockServiceInterface  {
    public abstract void insertShare(StockAccount stockAccount);
    public abstract void buyShare(String name, int numberOfShares, StockAccount stockAccount);
    public abstract void sellShare(String name, int numberOfShares, StockAccount stockAccount);
    public abstract void printStockReport();
    public abstract void calculateParticularStockValue(StockAccount stockAccount, String name);
    public abstract void calculateTotalStockValue(StockAccount stockAccount);
}
