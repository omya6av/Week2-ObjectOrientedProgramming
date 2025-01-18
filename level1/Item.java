// create a Item class
class Item {

    String itemCode;
    String itemName;
    double price;
    int quantity;

    // Item constructor
    Item(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // calculate the total cost
    public double totalCost(int numberOfItem) {
        return price * numberOfItem;
    }

    // display the Item details.
    public void display() {
        System.out.println("Item Code : " + itemCode + ", \nName of Item : " + itemName + ", \nprice in INR is: " + price + ", \nQuantity of item : " + quantity + " \nand the total cose is : " + totalCost(quantity));
    }

}

class Main {
    public static void main(String[] args) {

        // create a object of Item
        Item item = new Item("xNe03", "PS-5", 123000, 4);

        item.display();
    }
}