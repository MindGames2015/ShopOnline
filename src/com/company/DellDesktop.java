package com.company;

public class DellDesktop
{
    private double price;
    private int stocklevel;
    private int sold;

    public DellDesktop(double price, int stocklevel)
    {
        this.price = 400.00;
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
