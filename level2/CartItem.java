import java.util.Scanner;

// Class to represent a CartItem
class CartItem {

    // Instance variables to store CartItem  details
    String itemName;
    int quantity;
    double price;

    // Constructor to initialize the CartItem object
    CartItem (String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }


    // Add an item
    public void addAnItem(int numberOfItem, double newPrice) {

        quantity+= numberOfItem;
        price += newPrice;

        display(price, quantity);

    }

    // Remove an item
    public void RemoveAnItem(int numberOfItem, double newPrice) {

        if(quantity-numberOfItem < 0  || price-newPrice < 0){
            System.out.println("not possible");
             return;      }
        quantity -= numberOfItem;
        price -= newPrice;

        display(price, quantity);

    }

    // Method to display CartItem details
    public void display(double price, int quantity) {
        System.out.println("Total Cost : " + price +
                ", \nNumber of Items: " + quantity +
                ", \nItem Name : " + itemName);
    }

}

// Main class to run the program
class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CartItem items = new CartItem("UNO cards", 10, 105);

        System.out.println("1: Add an item to the cart.");
        System.out.println("2: Remove an item from the cart.");
        int option = input.nextInt();

        if(option==1){
            System.out.println("Number of item : ");
            int numberOfItem = input.nextInt();
            System.out.println("Price of item : " );
            double priceOfItem = input.nextInt();

            items.addAnItem( numberOfItem , priceOfItem );

        }else if( option == 2 ){
            System.out.println("Remove Number of item : ");
            int numberOfItem = input.nextInt();
            System.out.println("Price of item : " );
            double priceOfItem = input.nextInt();

            items.RemoveAnItem( numberOfItem, priceOfItem);

        }else{
            System.out.println(" Invalid input ");
        }



    }
}
