/* todo: import scanner, import array

todo 2: Start with, While !Q - map out ops
 2) Comit

 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Shop targay = new Shop("New Brighton", 508);
    static Scanner jts = new Scanner(System.in);

    static void ucryOptionsM() {
        System.out.println("Welcome to Tarjay!");
        //sout: "Please entre your manager pin"
        System.out.println("Type (C) to create product");
        System.out.println("Type (R) to read product");
        System.out.println("Type (U) to update product");
        System.out.println("Type (Y) to yeet product");
        System.out.println("Type (Q) yo quit");
        jts.nextLine();

    }

    public static void main(String[] args) {
    ucryOptionsM();
    //Manager password option
    String reply = jts.nextLine();

    while (!reply.equalsIgnoreCase("Q")) {

        //Create
        if(reply.equalsIgnoreCase("C") ) {

            //Asks product ID
            System.out.println("Please Enter Product ID: ");
            /* add conditions--is only numbers
             */
            int pID = jts.nextInt();
            jts.nextLine();

            //asks product Name
            System.out.println("Please Enter Product Name");
            String pName = jts.nextLine();

            //Asks product cost
            System.out.println("Please Enter Product Cost ");
            double pCost = jts.nextDouble();
            jts.nextLine();

            //Asks in stock
            System.out.println("Is Product in Stock?");
            boolean inStock = jts.nextBoolean();
            jts.nextLine();

            //creates new product
            Product newProduct = new Product(pName, pID, pCost, inStock);
            targay.products.add(newProduct);
            targay.printInventory();
            //asks same Question again until user inputs Q
            ucryOptionsM();
            reply = jts.nextLine();

            //Read
        } else if (reply.equalsIgnoreCase("R")) {
            targay.printInventory();
            System.out.println("What do you want to do next?");
            ucryOptionsM();
            reply = jts.nextLine();

            //Update
        } else if (reply.equalsIgnoreCase("U")) {
            System.out.println("Please enter product ID Number");
            int productID = jts.nextInt();
            jts.nextLine();
            Product updatedP = targay.findProductByPID(productID);

        }

        //Update
    }





    }
}

