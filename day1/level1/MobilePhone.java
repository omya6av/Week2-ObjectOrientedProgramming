// create MobilePhone class
class MobilePhone {

    String mobileBrand;
    String mobileModel;
    double price;

    // MobilePhone constructor
    MobilePhone(String mobileBrand, String mobileModel, double price) {
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.price = price;
    }

    // display the Item details.
    public void display() {
        System.out.println("Brand name of MobilePhone is : " + mobileBrand + ", \nModel of MobilePhone : " + mobileModel + ", \nprice of MobilePhone in INR is: " + price);
    }
}

class Main {
    public static void main(String[] args) {

        // create a object of MobilePhone
        MobilePhone mobile = new MobilePhone("Iphone", "Iphone-15", 63000);
        mobile.display();
    }
}