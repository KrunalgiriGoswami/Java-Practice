public class AnonymousInnerClassExample {
    // Base class
    static class Vehicle {
        void start() {
            System.out.println("Vehicle is starting");
        }
    }

    public static void main(String[] args) {
        // Anonymous inner class extending the Vehicle class for a Car
        Vehicle car = new Vehicle() {
            @Override
            void start() {
                System.out.println("Car is starting with a roar!");
            }
        };

        // Anonymous inner class extending the Vehicle class for a Bike
        Vehicle bike = new Vehicle() {
            @Override
            void start() {
                System.out.println("Bike is starting with a zoom!");
            }
        };

        // Anonymous inner class extending the Vehicle class for a Truck
        Vehicle truck = new Vehicle() {
            @Override
            void start() {
                System.out.println("Truck is starting with a heavy rumble!");
            }
        };

        // Calling the start method on each vehicle
        car.start();
        bike.start();
        truck.start();
    }
}
