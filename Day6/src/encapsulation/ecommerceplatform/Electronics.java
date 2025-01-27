package encapsulation.ecommerceplatform;

class Electronics extends Product implements Taxable {

    Electronics( int productId , String name,double price){
        super(productId,name,price);
    }

    //Calculate discount 10%
    public double calculateDiscount(){
        return getPrice()*0.10;
    }

    //calculate tax 15%
    public double calculateTax() {
        return getPrice() * 0.15;
    }

    public String getTaxDetails() {
        return "15% tax applied on Electronics.";
    }
}
