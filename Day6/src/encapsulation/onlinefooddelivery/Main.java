package encapsulation.onlinefooddelivery;

public class Main {

    public static void processOrder (FoodItem foodItem){
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: INR" + foodItem.calculateTotalPrice());

        if (foodItem instanceof Discountable) {
            Discountable discountable = (Discountable) foodItem;
            discountable.applyDiscount(10); // Applying 10% discount
            System.out.println(discountable.getDiscountDetails());
        }
    }

    public static void main (String[]args){
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 500, 3);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 777, 1);

        System.out.println("Processing Veg Item:");
        processOrder(vegItem);

        System.out.println("Processing Non-Veg Item:");
        processOrder(nonVegItem);
    }
}

