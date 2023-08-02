package vendingmachine;

/**
 *
 * @author jasperadrada
 */
public class PaymentBundle {
    public int pay1;
    public int pay5;
    public int pay10;
    public int pay20;
    public int pay50;
    public int pay100;
    public int pay200;
    public int pay500;
    public int pay1000;

    /**
     * Constructs a PaymentBundle with the specified payment denominations.
     *
     * @param enteredPayment an array of integers representing the payment denominations in the order: [pay5, pay10, pay20, pay50, pay100, pay200, pay500, pay1000]
     */
    PaymentBundle(int... enteredPayment) {
        this.pay1 = enteredPayment[0];
        this.pay5 = enteredPayment[1];
        this.pay10 = enteredPayment[2];
        this.pay20 = enteredPayment[3];
        this.pay50 = enteredPayment[4];
        this.pay100 = enteredPayment[5];
        this.pay200 = enteredPayment[6];
        this.pay500 = enteredPayment[7];
        this.pay1000 = enteredPayment[8];
    }

    /**
     * Calculates and returns the total value of payments in the specified denominations.
     *
     * @return the total value of payments
     */
    public int getTotal() {
        int total = 0;
        total = total + this.pay1 * 1;
        total = total + this.pay5 * 5;
        total = total + this.pay10 * 10;
        total = total + this.pay20 * 20;
        total = total + this.pay50 * 50;
        total = total + this.pay100 * 100;
        total = total + this.pay200 * 200;
        total = total + this.pay500 * 500;
        total = total + this.pay1000 * 1000;
        return total;
    }
}
