public class Product {

    //varaibles
 String pName;
   double pCost;
   int pID;
   boolean inStock;

    //create product method
    public Product(String pName, int pID, double pCost, boolean inStock) {
        this.pName = pName;
        this.pCost = pCost;
        this.inStock = inStock;
        this.pID = pID;
    }

    //to string/reads product
   public void printProduct(){
       System.out.println("Product Name: "  + pName + "\n Product Cost: " + pCost + "\n Product ID: " + pID + "\n In Stock: " + inStock);
   }
}
