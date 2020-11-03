package com.company;

public class AppleTablets
{
    private double price;
    private int stocklevel;

    public AppleTablets(double price, int stocklevel)
    {
        this.price = 350.00;
        this.stocklevel = 10;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getStocklevel()
    {
        return stocklevel;
    }

    public void setStocklevel(int stocklevel)
    {
        this.stocklevel = stocklevel;
    }

    public int decrementStockLevel()
    {
        stocklevel--;
    }
}
