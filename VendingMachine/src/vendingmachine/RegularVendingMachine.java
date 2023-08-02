package vendingmachine;
import java.util.Scanner;
/**
 *
 * @author jasperadrada
 */
public class RegularVendingMachine implements StandardVM {
    
    public static int selectedProduct;
    public int choice;
    public int[] stock = new int[12];
    
    public void forTheBackButton ( ) {
        for (int i = 0; i < 12; i++) {
            this.stock[i] = cancel(i);
        }
    }

    // Getter
    
    @Override
    public int selectProduct(int product) {
        int stock = 0;
        switch (product) {
            case 1:
                Product item1 = Product.BROWN_RICE;
                stock = Product.BROWN_RICE.getQuantity();
                stock = stock - 1;
                actualStock(item1, stock);              
                break;
            case 2:
                Product item2 = Product.WHITE_RICE;
                stock = Product.WHITE_RICE.getQuantity();
                stock = stock - 1;
                actualStock(item2, stock);
            case 3:
                Product item3 = Product.JAVA_RICE;
                stock = Product.JAVA_RICE.getQuantity();
                stock = stock - 1;
                actualStock(item3, stock);
                break;
            case 4:
                Product item4 = Product.BACON_BITS;
                stock = Product.BACON_BITS.getQuantity();
                stock = stock - 1;
                actualStock(item4, stock);
            case 5:
                Product item5 = Product.ROASTED_MUSHROOMS;
                stock = Product.ROASTED_MUSHROOMS.getQuantity();
                stock = stock - 1;
                actualStock(item5, stock);
                break;
            case 6:
                Product item6 = Product.EDAMAME;
                stock = Product.EDAMAME.getQuantity();
                stock = stock - 1;
                actualStock(item6, stock);
            case 7:
                Product item7 = Product.GRILLED_CHICKEN;
                stock = Product.GRILLED_CHICKEN.getQuantity();
                stock = stock - 1;
                actualStock(item7, stock);
                break;
            case 8:
                Product item8 = Product.GROUND_BEEF;
                stock = Product.GROUND_BEEF.getQuantity();
                stock = stock - 1;
                actualStock(item8, stock);
            case 9:
                Product item9 = Product.MEATBALLS;
                stock = Product.MEATBALLS.getQuantity();
                stock = stock - 1;
                actualStock(item9, stock);
                break;
            case 10:
                Product item10 = Product.SALMON;
                stock = Product.SALMON.getQuantity();
                stock = stock - 1;
                actualStock(item10, stock);
            case 11:
                Product item11 = Product.TERIYAKI;
                stock = Product.TERIYAKI.getQuantity();
                stock = stock - 1;
                actualStock(item11, stock);
                break;
            case 12:
                Product item12 = Product.CHEESE;
                stock = Product.CHEESE.getQuantity();
                stock = stock - 1;
                actualStock(item12, stock);
                break;
        }
        
        return stock;
    }
    
    public int cancel(int product) {
        this.selectedProduct = product;
        int stock = 0;
        switch (product) {
            case 1:
                Product item1 = Product.BROWN_RICE;
                stock = Product.BROWN_RICE.getQuantity();
                stock = stock + 1;
                actualStock(item1, stock);              
                break;
            case 2:
                Product item2 = Product.WHITE_RICE;
                stock = Product.WHITE_RICE.getQuantity();
                stock = stock + 1;
                actualStock(item2, stock);
            case 3:
                Product item3 = Product.JAVA_RICE;
                stock = Product.JAVA_RICE.getQuantity();
                stock = stock + 1;
                actualStock(item3, stock);
                break;
            case 4:
                Product item4 = Product.BACON_BITS;
                stock = Product.BACON_BITS.getQuantity();
                stock = stock + 1;
                actualStock(item4, stock);
            case 5:
                Product item5 = Product.ROASTED_MUSHROOMS;
                stock = Product.ROASTED_MUSHROOMS.getQuantity();
                stock = stock + 1;
                actualStock(item5, stock);
                break;
            case 6:
                Product item6 = Product.EDAMAME;
                stock = Product.EDAMAME.getQuantity();
                stock = stock + 1;
                actualStock(item6, stock);
            case 7:
                Product item7 = Product.GRILLED_CHICKEN;
                stock = Product.GRILLED_CHICKEN.getQuantity();
                stock = stock + 1;
                actualStock(item7, stock);
                break;
            case 8:
                Product item8 = Product.GROUND_BEEF;
                stock = Product.GROUND_BEEF.getQuantity();
                stock = stock + 1;
                actualStock(item8, stock);
            case 9:
                Product item9 = Product.MEATBALLS;
                stock = Product.MEATBALLS.getQuantity();
                stock = stock + 1;
                actualStock(item9, stock);
                break;
            case 10:
                Product item10 = Product.SALMON;
                stock = Product.SALMON.getQuantity();
                stock = stock + 1;
                actualStock(item10, stock);
            case 11:
                Product item11 = Product.TERIYAKI;
                stock = Product.TERIYAKI.getQuantity();
                stock = stock + 1;
                actualStock(item11, stock);
                break;
            case 12:
                Product item12 = Product.CHEESE;
                stock = Product.CHEESE.getQuantity();
                stock = stock + 1;
                actualStock(item12, stock);
                break;
        }
        
        return stock;
    }

    @Override
    public int invalidPurchase(int productID) {
        int stock;
        int valid = 0;
        switch (productID) {
            case 1:
                stock = Product.BROWN_RICE.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
            case 2:
                stock = Product.WHITE_RICE.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
            case 3:
                stock = Product.JAVA_RICE.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
            case 4:
                stock = Product.BACON_BITS.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
            case 5:
                stock = Product.ROASTED_MUSHROOMS.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
            case 6:
                stock = Product.EDAMAME.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
            case 7:
                stock = Product.GRILLED_CHICKEN.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
            case 8:
                stock = Product.GROUND_BEEF.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
            case 9:
                stock = Product.MEATBALLS.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
            case 10:
                stock = Product.SALMON.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
            case 11:
                stock = Product.TERIYAKI.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
            case 12:
                stock = Product.CHEESE.getQuantity();
                if (stock < 1)
                    valid = 0;
                else
                    valid = 1;
                break;
        }
        return valid;
    }




    @Override
    public boolean verifyUserDecision() {
        int decision;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("CONTINUE PURCHASE?");
            System.out.println("[1] YES");
            System.out.println("[2] NO");
            System.out.printf("SELECT AN OPTION:");
            decision = scanner.nextInt();
        } while (decision != 1 && decision != 2);

        if (decision == 1)
            return true;
        else
            return false;
    }

    

    @Override
    public void enterPayment(int... payment) {
        Calculator calculator = new SimpleCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new PaymentBundle(payment));
        int changeAmount = total - product.getPrice();
        //this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void buffer() {
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
    }

    @Override
    public void storePayment(int... payment) {
        int added;
        int stock;
        int bankers;
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] > 0) {
                added = payment[i];
                switch (i + 1) {
                    case 1:
                        Payment one = Payment.FIVE_PESOS;
                        stock = Payment.FIVE_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(one, bankers);
                        break;
                    case 2:
                        Payment two = Payment.TEN_PESOS;
                        stock = Payment.TEN_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(two, bankers);
                        break;
                    case 3:
                        Payment three = Payment.TWENTY_PESOS;
                        stock = Payment.TWENTY_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(three, bankers);
                        break;
                    case 4:
                        Payment four = Payment.FIFTY_PESOS;
                        stock = Payment.FIFTY_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(four, bankers);
                        break;
                    case 5:
                        Payment five = Payment.ONE_HUNDRED_PESOS;
                        stock = Payment.ONE_HUNDRED_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(five, bankers);
                        break;
                    case 6:
                        Payment six = Payment.TWO_HUNDRED_PESOS;
                        stock = Payment.TWO_HUNDRED_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(six, bankers);
                        break;
                    case 7:
                        Payment seven = Payment.FIVE_HUNDRED_PESOS;
                        stock = Payment.FIVE_HUNDRED_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(seven, bankers);
                        break;
                    case 8:
                        Payment eight = Payment.ONE_THOUSAND_PESOS;
                        stock = Payment.ONE_THOUSAND_PESOS.getStock();
                        bankers = added + stock;
                        newPaymentStock(eight, bankers);
                        break;
                }
            }
        }
    }

    public void newPaymentStock(Payment payment, int added) {
        payment.setStock(added);
    }

    @Override
//    public void changeMessage() {
//        Scanner scanner = new Scanner(System.in);
//        int stock, bankers;
//        String buffer;
//        System.out.println("");
//        System.out.println("YOUR CHANGE IS: " + change.getTotal() + " CHANGE SPLITTED AS FOLLLOWS:");
//        System.out.println("");
//        System.out.println("1000 PESOS: " + change.pay1000);
//        System.out.println("500 PESOS: " + change.pay500);
//        System.out.println("200 PESOS: " + change.pay200);
//        System.out.println("100 PESOS: " + change.pay100);
//        System.out.println("50 PESOS: " + change.pay50);
//        System.out.println("20 PESOS: " + change.pay20);
//        System.out.println("10 PESOS: " + change.pay10);
//        System.out.println("5 PESOS: " + change.pay5);
//        System.out.println("1 PESO: " + change.pay1);
//        System.out.println("");
//        System.out.printf("PRESS 1 TO FINISH TRANSACTION: ");
//        buffer = scanner.nextLine();
//
//        if (change.pay1 > 0) {
//            Payment zero = Payment.ONE_PESO;
//            stock = Payment.ONE_PESO.getStock();
//            bankers = stock - change.pay1;
//            newPaymentStock(zero, bankers);
//        }
//
//        if (change.pay5 > 0) {
//            Payment one = Payment.FIVE_PESOS;
//            stock = Payment.FIVE_PESOS.getStock();
//            bankers = stock - change.pay5;
//            newPaymentStock(one, bankers);
//        }
//
//        if (change.pay10 > 0) {
//            Payment two = Payment.TEN_PESOS;
//            stock = Payment.TEN_PESOS.getStock();
//            bankers = stock - change.pay10;
//            newPaymentStock(two, bankers);
//        }
//
//        if (change.pay20 > 0) {
//            Payment three = Payment.TWENTY_PESOS;
//            stock = Payment.TWENTY_PESOS.getStock();
//            bankers = stock - change.pay20;
//            newPaymentStock(three, bankers);
//        }
//
//        if (change.pay50 > 0) {
//            Payment four = Payment.FIFTY_PESOS;
//            stock = Payment.FIFTY_PESOS.getStock();
//            bankers = stock - change.pay50;
//            newPaymentStock(four, bankers);
//        }
//
//        if (change.pay100 > 0) {
//            Payment five = Payment.ONE_HUNDRED_PESOS;
//            stock = Payment.ONE_HUNDRED_PESOS.getStock();
//            bankers = stock - change.pay100;
//            newPaymentStock(five, bankers);
//        }
//
//        if (change.pay200 > 0) {
//            Payment six = Payment.TWO_HUNDRED_PESOS;
//            stock = Payment.TWO_HUNDRED_PESOS.getStock();
//            bankers = stock - change.pay20;
//            newPaymentStock(six, bankers);
//        }
//
//        if (change.pay500 > 0) {
//            Payment seven = Payment.FIVE_HUNDRED_PESOS;
//            stock = Payment.FIVE_HUNDRED_PESOS.getStock();
//            bankers = stock - change.pay20;
//            newPaymentStock(seven, bankers);
//        }
//
//        if (change.pay1000 > 0) {
//            Payment eight = Payment.ONE_HUNDRED_PESOS;
//            stock = Payment.ONE_HUNDRED_PESOS.getStock();
//            bankers = stock - change.pay20;
//            newPaymentStock(eight, bankers);
//        }
//    }


    /**
     * Displays the actual stock of a product.
     *
     * @param product        the product to display the stock for
     * @param stockRemaining the remaining stock of the product
     */
    public void actualStock(Product product, int stockRemaining) {
        product.setQuantity(stockRemaining);
    }
    
    public void setThis (String item) {
        int test = Integer.parseInt(item);
        this.choice = test;
    }
    
    
    public static int calculateTotalPayment(String payment) {
        String[] paymentArray = payment.split(",");
        int totalPayment = 0;

        int payment1 = Integer.parseInt(paymentArray[0]);
        int payment5 = Integer.parseInt(paymentArray[1]);
        int payment10 = Integer.parseInt(paymentArray[2]);
        int payment20 = Integer.parseInt(paymentArray[3]);
        int payment50 = Integer.parseInt(paymentArray[4]);
        int payment100 = Integer.parseInt(paymentArray[5]);
        int payment200 = Integer.parseInt(paymentArray[6]);
        int payment500 = Integer.parseInt(paymentArray[7]);
        int payment1000 = Integer.parseInt(paymentArray[8]);

        totalPayment = payment1 * 1 + payment5 * 5 + payment10 * 10 +
                       payment20 * 20 + payment50 * 50 + payment100 * 100 +
                       payment200 * 200 + payment500 * 500 + payment1000 * 1000;

        return totalPayment;
    }
    
    public static int[] calculateChange(int changeAmount, int[] denominations) {
        int[] change = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            change[i] = changeAmount / denominations[i];
            changeAmount %= denominations[i];
        }

        return change;
    
}
}
