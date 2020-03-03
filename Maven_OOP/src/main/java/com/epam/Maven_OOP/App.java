package com.epam.Maven_OOP;

public class App 
{
    public static void main( String[] args )
    {
    	
        Chocolate chocolate = new Chocolate(100, 2, "DairyMilk");
        System.out.println(chocolate.calculateWeight());
        Sweets sweets = new Sweets(100, 3, "Laddu");
    }
}
