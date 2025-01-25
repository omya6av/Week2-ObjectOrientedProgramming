package hybridinheritance.restaurantmanagementsystem;

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("omi", 98);
        Waiter waiter = new Waiter("Sakshi", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
