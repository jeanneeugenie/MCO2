/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author jasperadrada
 */
public enum Payment {
    ONE_PESO(1, 10),
    FIVE_PESOS(5, 10),
    TEN_PESOS(10, 10),
    TWENTY_PESOS(20, 10),
    FIFTY_PESOS(50, 10),
    ONE_HUNDRED_PESOS(100, 10),
    TWO_HUNDRED_PESOS(200, 10),
    FIVE_HUNDRED_PESOS(500, 10),
    ONE_THOUSAND_PESOS(1000, 10);

    private int payment;
    public int stock;

    /**
     * Constructs a Payment object with the specified payment value and initial stock.
     *
     * @param payment the payment value
     * @param stock   the initial stock of the payment option
     */
    private Payment(int payment, int stock) {
        this.payment = payment;
        this.stock = stock;
    }

    /**
     * Gets the current stock of the payment option.
     *
     * @return the current stock
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Sets the stock of the payment option to the specified value.
     *
     * @param stock the new stock value
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Parses the user payment input and returns an array of payment amounts.
     *
     * @param userPayment the user payment input
     * @return an array of payment amounts
     */
    public static int[] parsePayment(String userPayment) {
        String[] numberPaymentInText = userPayment.split(",");
        int[] results = new int[numberPaymentInText.length];
        for (int i = 0; i < numberPaymentInText.length; i++) {
            results[i] = Integer.parseInt(numberPaymentInText[i]);
        }
        return results;
    }
}
