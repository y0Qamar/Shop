/* todo: install scanner, install arraylist.



 */

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Shop {
    //shop variables + declare scanner

    static String shopName;
    static int shopNum;
    static ArrayList<Product> products;

    //add shop

    public Shop(String shopName, int shopNum) {
        Shop.shopName = shopName;
        Shop.shopNum = shopNum;
        products = new ArrayList<>();

    }

    //add product
   public void addProduct(String pName, int pID, double pCost, boolean inStock) {
    Product product = new Product(pName, pID, pCost, inStock);
    products.add(product);

   }

    //read products
    public void printInventory() {
        for (Product product : this.products) {
          product.printProduct();

        }
    }

    //find product by ID
    public Product findProductByPID(int pID) {
        for (Product product : products)
            if (product.pID == pID) {
                return product;
            }
        return null;
    }


    //remove product
public void removeProduct(int pID){
Product removedProduct = findProductByPID(pID);
products.remove(removedProduct);
    System.out.println(removedProduct + "has no been removed from the system");
printInventory();
    }
}




