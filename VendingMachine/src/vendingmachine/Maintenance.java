/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendingmachine;
import java.util.Scanner;
/**
 *
 * @author jasperadrada
 */
public class Maintenance {
    RegularVendingMachine support = new RegularVendingMachine();

    /**
     * Enters the maintenance mode of the vending machine.
     */
    

    /**
     * Description: Instead of ordering they put code to activate maintenance
     *
     * @return code
     */
    public int getMaintenanceCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ENTER MAINTENANCE CODE: ");
        int code = scanner.nextInt();
        return code;
    }

    /**
     * @param code
     * @return true if code matches, false if not
     */
    public boolean checkMaintenance(int code) {
        if (code == 121)
            return true;
        else
            return false;
    }

    public void maintenanceGuide() {
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║        P R O D U C T S        ║");
        System.out.println("╠═══════════════════════════════╣");
        System.out.println("║ [1]  BROWN RICE               ║");
        System.out.println("║      PRICE:" + Product.BROWN_RICE.price + "                 ║");
        System.out.println("║ [2]  WHITE RICE               ║");
        System.out.println("║      PRICE:" + Product.WHITE_RICE.price + "                 ║");
        System.out.println("║ [3]  JAVA RICE                ║");
        System.out.println("║      PRICE:" + Product.JAVA_RICE.price + "                 ║");
        System.out.println("║ [4]  BACON BITS               ║");
        System.out.println("║      PRICE:" + Product.BACON_BITS.price + "                 ║");
        System.out.println("║ [5]  ROASTED MUSHROOMS        ║");
        System.out.println("║      PRICE:" + Product.EDAMAME.price + "                 ║");
        System.out.println("║ [6]  EDAMAME                  ║");
        System.out.println("║      PRICE:" + Product.ROASTED_MUSHROOMS.price + "                 ║");
        System.out.println("║ [7]  GRILLED CHICKEN          ║");
        System.out.println("║      PRICE:" + Product.GRILLED_CHICKEN.price + "                 ║");
        System.out.println("║ [8]  GROUND BEEF              ║");
        System.out.println("║      PRICE:" + Product.GROUND_BEEF.price + "                 ║");
        System.out.println("║ [9]  MEATBALLS                ║");
        System.out.println("║      PRICE:" + Product.MEATBALLS.price + "                 ║");
        System.out.println("║ [10] SALMON                   ║");
        System.out.println("║      PRICE:" + Product.SALMON.price + "                 ║");
        System.out.println("║ [11] TERIYAKI                 ║");
        System.out.println("║      PRICE:" + Product.TERIYAKI.price + "                 ║");
        System.out.println("║ [12] CHEESE                   ║");
        System.out.println("║      PRICE:" + Product.CHEESE.price + "                 ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println("ENTER PRODUCT:");
    }

    /**
     * Restocks a specific product in the vending machine.
     *
     * @param productID the ID of the product to restock
     */
    public void restockOneProduct(int productID, int stock) {
        switch (productID) {
            case 1:
                Product item1 = Product.BROWN_RICE;
                support.actualStock(item1, stock);
                break;
            case 2:
                Product item2 = Product.WHITE_RICE;
                support.actualStock(item2, stock);
            case 3:
                Product item3 = Product.JAVA_RICE;
                support.actualStock(item3, stock);
                break;
            case 4:
                Product item4 = Product.BACON_BITS;
                support.actualStock(item4, stock);
            case 5:
                Product item5 = Product.ROASTED_MUSHROOMS;
                support.actualStock(item5, stock);
                break;
            case 6:
                Product item6 = Product.EDAMAME;
                support.actualStock(item6, stock);
            case 7:
                Product item7 = Product.GRILLED_CHICKEN;
                support.actualStock(item7, stock);
                break;
            case 8:
                Product item8 = Product.GROUND_BEEF;
                support.actualStock(item8, stock);
            case 9:
                Product item9 = Product.MEATBALLS;
                support.actualStock(item9, stock);
                break;
            case 10:
                Product item10 = Product.SALMON;
                support.actualStock(item10, stock);
            case 11:
                Product item11 = Product.TERIYAKI;
                support.actualStock(item11, stock);
                break;
            case 12:
                Product item12 = Product.CHEESE;
                support.actualStock(item12, stock);
                break;
        }
    }


    /**
     * Restocks all products in the vending machine.
     */
    public void restockAllProducts() {

        Scanner scanner = new Scanner(System.in);
        String buffer;

        int stock = 15;

        Product item1 = Product.BROWN_RICE;
        Product item2 = Product.WHITE_RICE;
        Product item3 = Product.JAVA_RICE;
        Product item4 = Product.BACON_BITS;
        Product item5 = Product.ROASTED_MUSHROOMS;
        Product item6 = Product.EDAMAME;
        Product item7 = Product.GRILLED_CHICKEN;
        Product item8 = Product.GROUND_BEEF;
        Product item9 = Product.MEATBALLS;
        Product item10 = Product.SALMON;
        Product item11 = Product.TERIYAKI;
        Product item12 = Product.CHEESE;

        support.actualStock(item1, stock);
        support.actualStock(item2, stock);
        support.actualStock(item3, stock);
        support.actualStock(item4, stock);
        support.actualStock(item5, stock);
        support.actualStock(item6, stock);
        support.actualStock(item7, stock);
        support.actualStock(item8, stock);
        support.actualStock(item9, stock);
        support.actualStock(item10, stock);
        support.actualStock(item11, stock);
        support.actualStock(item12, stock);

        System.out.println("THANK YOU FOR RESTOCKING SILOGAN! ALL PRODUCTS ARE NOW RESTOCKED!!");
        System.out.printf("PRESS 1 TO GO BACK TO THE MAIN MENU: ");
        buffer = scanner.next();
    }

    public void modifyPrice(int productID, int price) {

        
        Scanner scanner = new Scanner(System.in);

        switch (productID) {
            case 1:
                Product item1 = Product.BROWN_RICE;
                newPrice(item1, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF BROWN RICE TO " + price + " PESOS");
                break;
            case 2:
                Product item2 = Product.WHITE_RICE;
                
                newPrice(item2, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF WHITE RICE TO " + price + " PESOS");
                break;
            case 3:
                Product item3 = Product.JAVA_RICE;
         
                newPrice(item3, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF JAVA RICE TO " + price + " PESOS");
                break;
            case 4:
                Product item4 = Product.BACON_BITS;
 
                newPrice(item4, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF BACON BITS TO " + price + " PESOS");
                break;
            case 5:
                Product item5 = Product.ROASTED_MUSHROOMS;
  
                newPrice(item5, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF ROASTED MUSHROOMS TO " + price + " PESOS");
                break;
            case 6:
                Product item6 = Product.EDAMAME;
         
                newPrice(item6, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF EDAMAME TO " + price + " PESOS");
                break;
            case 7:
                Product item7 = Product.GRILLED_CHICKEN;
   
                newPrice(item7, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF GRILLED CHICKEN TO " + price + " PESOS");
                break;
            case 8:
                Product item8 = Product.GROUND_BEEF;
   
                newPrice(item8, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF GROUND_BEEF TO " + price + " PESOS");
                break;
            case 9:
                Product item9 = Product.MEATBALLS;
              
                newPrice(item9, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF MEATBALLS TO " + price + " PESOS");
                break;
            case 10:
                Product item10 = Product.SALMON;
        
                newPrice(item10, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF SALMON TO " + price + " PESOS");
                break;
            case 11:
                Product item11 = Product.TERIYAKI;
         
                newPrice(item11, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF TERIYAKI SAUCE TO " + price + " PESOS");
                break;
            case 12:
                Product item12 = Product.CHEESE;
     
                newPrice(item12, price);
                System.out.println("SUCCESSFULLY CHANGED THE PRICE OF CHEESE SAUCE TO " + price + " PESOS");
                break;
        }
    }


    /**
     * Sets a new price for the specified product.
     *
     * @param product  the product to modify the price for
     * @param priceTag the new price for the product
     */
    public void newPrice(Product product, int priceTag) {
        product.setPrice(priceTag);
    }


    public void newCalorie(Product product, int Calorie) {
        product.setCalories(Calorie);
    }

    /**
     * Performs banking operations.
     */
    public void Bank() {
        Scanner scanner = new Scanner(System.in);
        String buffer;
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║     MONEY INSIDE SILOGAN      ║");
        System.out.println("╠═══════════════════════════════╣");
        System.out.println("║ [5 PESOS] " + Payment.FIVE_PESOS.getStock() + " PIECES           ║");
        System.out.println("║ [10 PESOS] " + Payment.TEN_PESOS.getStock() + " PIECES          ║");
        System.out.println("║ [20 PESOS] " + Payment.TWENTY_PESOS.getStock() + " PIECES          ║");
        System.out.println("║ [50 PESOS] " + Payment.FIFTY_PESOS.getStock() + " PIECES          ║");
        System.out.println("║ [100 PESOS] " + Payment.ONE_HUNDRED_PESOS.getStock() + " PIECES         ║");
        System.out.println("║ [200 PESOS] " + Payment.TWO_HUNDRED_PESOS.getStock() + " PIECES         ║");
        System.out.println("║ [500 PESOS] " + Payment.FIVE_HUNDRED_PESOS.getStock() + " PIECES         ║");
        System.out.println("║ [1000 PESOS] " + Payment.ONE_THOUSAND_PESOS.getStock() + " PIECES        ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.printf("PRESS 1 TO GO BACK TO THE MAIN MENU: ");
        buffer = scanner.next();
    }
    
}
