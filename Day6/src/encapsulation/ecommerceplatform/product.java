package encapsulation.ecommerceplatform;

abstract class Product {
    private int productId ;
    private String name;
    private double price;

    Product( int productId , String name,double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //Getter for product id
    public int getId(){
        return productId;
    }
    //Getter for product name
    public String getName(){
        return name;
    }
    //Getter for product price
    public double getPrice(){
        return price;
    }

    //Setters
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    //Abstract method
    abstract double calculateDiscount();
}
