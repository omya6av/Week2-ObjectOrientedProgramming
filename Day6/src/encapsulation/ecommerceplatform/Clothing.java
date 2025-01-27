package encapsulation.ecommerceplatform;

class Clothing extends Product implements Taxable {

    Clothing( int productId , String name,double price){
        super(productId,name,price);
    }

    //Calculate discount 20%
    public double calculateDiscount(){
        return getPrice()*0.20;
    }

    //calculate tax 10%
    public double calculateTax() {
        return getPrice() * 0.10;
    }

    public String getTaxDetails() {
        return "10% tax applied on clothing.";
    }
}
