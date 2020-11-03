package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    DellDesktop dellDesktop = new DellDesktop(400.00,10);

	    dellDesktop.getPrice();
	    dellDesktop.getStocklevel();

	    while (stocklevel > 1 && stocklevel < 11)
        {
            System.out.println("Stock Level of Dell Desktop " + dellDesktop.getStocklevel());
            System.out.println("Sold " + dellDesktop.sold);
            dellDesktop.decrementStockLevel();
        }

        System.out.println("Dell Desktop sold " + dellDesktop.sold);
        System.out.println("Dell Desktop in stock " + dellDesktop.getStocklevel());


        // Add more stock when stock level at 1 method

    }
}
