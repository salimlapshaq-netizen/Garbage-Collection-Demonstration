package victoria.vehicle;

public class Vehicle {
    public static void main(String[] args) {
        // 1. Create two vehicle objects
        Vehicles c1 = new Vehicles("Red", "Toyota", "New");
        Vehicles c2 = new Vehicles("Blue", "Honda", "Used");

        System.out.println("c1 is: " + c1.getColor()); // Shows Red
        System.out.println("c2 is: " + c2.getColor()); // Shows Blue

        // The assignment statement that creates garbage
        c1 = c2;
        
        System.out.println("After c1 = c2...");
        System.out.println("c1 is now: " + c1.getColor()); // Now shows Blue
    }
}