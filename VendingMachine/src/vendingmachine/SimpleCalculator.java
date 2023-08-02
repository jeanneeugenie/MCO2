package vendingmachine;

/**
 *
 * @author jasperadrada
 */
public class SimpleCalculator implements Calculator {
    /**
     * Calculates the total value of payments in the given PaymentBundle.
     *
     * @param payment the PaymentBundle containing the payment denominations
     * @return the total value of payments
     */
    @Override
    public int calculateTotal(PaymentBundle payment) {
        return payment.getTotal();
    }

    /**
     * Calculates the change to be returned based on the given amount.
     *
     * @param changeToReturn the amount of change to be returned
     * @return a PaymentBundle representing the change with denominations
     */
    @Override
    public PaymentBundle calculateChange(int changeToReturn) {
        PaymentBundle change = new PaymentBundle((new int[9]));
        int amountLeft = changeToReturn;

        change.pay1000 = amountLeft / 1000;
        amountLeft = amountLeft % 1000;

        change.pay500 = amountLeft / 500;
        amountLeft = amountLeft % 500;

        change.pay200 = amountLeft / 200;
        amountLeft = amountLeft % 200;

        change.pay100 = amountLeft / 100;
        amountLeft = amountLeft % 100;

        change.pay50 = amountLeft / 50;
        amountLeft = amountLeft % 50;

        change.pay20 = amountLeft / 20;
        amountLeft = amountLeft % 20;

        change.pay10 = amountLeft / 10;
        amountLeft = amountLeft % 10;

        change.pay5 = amountLeft / 5;

        change.pay1 = amountLeft / 1;

        return change;
    }
}
