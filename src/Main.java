/* todo: import scanner, import array

 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Shop tarjay1 = new Shop("New Brighton", 508);
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
     tarjay1.addProduct("hair stuff",13502,9.99,true);
     tarjay1.printInventory();



    }
}

