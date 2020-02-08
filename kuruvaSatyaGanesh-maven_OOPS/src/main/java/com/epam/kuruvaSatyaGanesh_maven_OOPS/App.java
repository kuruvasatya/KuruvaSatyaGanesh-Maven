package com.epam.kuruvaSatyaGanesh_maven_OOPS;
import java.util.ArrayList;
import java.util.Scanner;

import com.epam.kuruvaSatyaGanesh_maven_OOPS.chocolates.Barone;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.chocolates.Cadbury;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.chocolates.Chocolate;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.chocolates.Galaxy;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.gift.Gift;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.sweets.Gulabjamun;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.sweets.Kajukatli;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.sweets.Kheer;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.sweets.Rasgulla;
import com.epam.kuruvaSatyaGanesh_maven_OOPS.sweets.Sweets;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("Getting chocolates....");
        Chocolate chocolate1=new Cadbury("Dairy Milk Silk",160,50);
        Chocolate chocolate2=new Barone("Bournville",83,45);
        Chocolate chocolate3=new Galaxy("Ferrero Rocher",500,500);
        System.out.println("Getting Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",100,50);
        Sweets sweets2=new Kheer("Kheer",200,100);
        Sweets sweets3=new Kajukatli("Basanthi",300,100);
        Sweets sweets4=new Rasgulla("Rasgulla",150,100);
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
        System.out.println("Sorting items in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
        //do
        while(true)
        {
        	System.out.println("<============== New Year Gifts=============> ");
            System.out.println("Enter '1' to view all candies : ");
            System.out.println("Enter '2' to view all sweets : ");
            System.out.println("Enter '3' to know most expensive chocolate and sweets : ");
            System.out.println("Enter '4' to Quit");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                ArrayList<Chocolate> arrayList=gift.getChocolates();
                for (Chocolate c:arrayList) {
                    System.out.println(c.toString());
                }
                break;
                case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("The Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("The Expensive Sweet : "+mostExpensive(gift.getSweets()));
                break;
                case 4:
                	System.out.println("***********ThankYou************");
                	System.exit(0);
                	break;
                default:
                System.out.println("Please enter a valid option!!");
                break;
            }
        }
        //while(choice < 4);
    }
    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}