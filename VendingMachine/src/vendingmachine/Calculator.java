package vendingmachine;

/**
 *
 * @author jasperadrada
 */
public interface Calculator {
    /**
     * Calculates the total value of payments in the given PaymentBundle.
     *
     * @param payment the PaymentBundle containing the payment denominations
     * @return the total value of payments
     */
    int calculateTotal(PaymentBundle payment);

    /**
     * Calculates the change to be returned based on the given amount.
     *
     * @param change the amount of change to be returned
     * @return a PaymentBundle representing the change with denominations
     */
    PaymentBundle calculateChange(int change);
}
