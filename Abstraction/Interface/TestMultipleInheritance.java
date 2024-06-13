// First interface
interface Vehicle {
    void startEngine();
    void stopEngine();
}

// Second interface
interface Electric {
    void chargeBattery();
    int getBatteryLevel();
}

// Implementing multiple interfaces
class Tesla implements Vehicle, Electric {
    private int batteryLevel;

    public Tesla(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Implementation of Vehicle interface methods
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    // Implementation of Electric interface methods
    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

public class TestMultipleInheritance {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla(75); // Battery level is initially 75%

        myTesla.startEngine(); // Output: Engine started.
        System.out.println("Battery level: " + myTesla.getBatteryLevel() + "%"); // Output: Battery level: 75%

        myTesla.chargeBattery(); // Output: Battery fully charged.
        System.out.println("Battery level: " + myTesla.getBatteryLevel() + "%"); // Output: Battery level: 100%

        myTesla.stopEngine(); // Output: Engine stopped.
    }
}
