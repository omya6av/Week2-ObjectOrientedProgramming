package encapsulation.onlinefooddelivery;

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
    }

    public String getDiscountDetails() {
        return "Discount on Veg Item: $" + discount;
    }
}

