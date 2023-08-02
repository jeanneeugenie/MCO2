/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author jasperadrada
 */
public enum Product {
    BROWN_RICE(1, 216, 30, 15),
    WHITE_RICE(2, 206, 15, 15),
    JAVA_RICE(3, 169, 20, 15),
    BACON_BITS(4, 33, 30, 15),
    ROASTED_MUSHROOMS(5, 20, 15, 15),
    EDAMAME(6, 12, 15, 15),
    GRILLED_CHICKEN(7, 147, 45, 15),
    GROUND_BEEF(8, 100, 55, 15),
    MEATBALLS(9, 197, 65, 15),
    SALMON(10, 178, 75, 15),
    TERIYAKI(11, 16, 10, 15),
    CHEESE(12, 110, 15, 15),
    SPECIAL(13, 0, 0, 1);


    int id;
    int calories;
    int quantity;
    public int price;

    /**
     * Constructs a Product enum with the specified properties.
     *
     * @param id       the ID of the product
     * @param calories the calorie count of the product
     * @param price    the price of the product
     * @param quantity the initial quantity of the product
     */
    Product(int id, int calories, int price, int quantity) {
        this.id = id;
        this.calories = calories;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the ID of the product.
     *
     * @return the product ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the product price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Retrieves the quantity of the product.
     *
     * @return the product quantity
     */
    public int getQuantity() {
        return this.quantity;
    }

    public int getCalorie() {
        return this.calories;
    }

    /**
     * Sets the price of the product.
     *
     * @param newPrice the new price of the product
     */
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param newQuantity the new quantity of the product
     */
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void setCalories(int newCalorie) {
        this.calories = newCalorie;
    }
    /**
     * Retrieves the Product enum based on the given product ID.
     *
     * @param productChosen the product ID
     * @return the corresponding Product enum, or null if not found
     */
    public static Product valueOf(int productChosen) {
        for (Product product : Product.values()) {
            if (productChosen == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
