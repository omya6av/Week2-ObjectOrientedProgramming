package encapsulation.onlinefooddelivery;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NON_VEG_EXTRA_CHARGE = 2.5;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_EXTRA_CHARGE) * getQuantity();
    }

    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
    }

    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: $" + discount;
    }
}

