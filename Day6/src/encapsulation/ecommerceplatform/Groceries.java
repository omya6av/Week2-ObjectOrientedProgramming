package encapsulation.ecommerceplatform;

class Groceries extends Product implements Taxable {

    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    //Calculate discount 10%
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    //calculate tax 5%
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% tax applied on Groceries.";
    }
}