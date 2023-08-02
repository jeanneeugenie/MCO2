/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author jasperadrada
 */
public interface StandardVM {
    
    /**
     * Selects a product based on the given product ID.
     *
     * @param Product the ID of the product to select
     */
    int selectProduct(int Product);

    /**
     * Verifies the user's decision.
     *
     * @return true if the user's decision is valid, false otherwise
     */
    boolean verifyUserDecision();

    /**
     * Accepts the user's payment.
     *
     * @param payment the payment amounts
     */
    void enterPayment(int... payment);

    /**
     * Buffers the system.
     */
    void buffer();

    /**
     * Stores the user's payment.
     *
     * @param payment the payment amounts
     */
    void storePayment(int... payment);

    /**
     * Displays the change message to the user.
     */
   // void changeMessage();




    /**
     * Handles an invalid purchase of a product.
     *
     * @param productID the ID of the product
     * @return the error code indicating the reason for the invalid purchase
     */
    int invalidPurchase(int productID);


    void actualStock(Product product, int stockRemaining);
}
