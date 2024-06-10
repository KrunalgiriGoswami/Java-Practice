public class MathClass {
    public static void main(String[] args) {

        // Absolute value
        int absValue = Math.abs(-10);
        System.out.println("Absolute value of -10: " + absValue);

        // Maximum of two numbers
        int maxValue = Math.max(5, 10);
        System.out.println("Maximum of 5 and 10: " + maxValue);

        // Minimum of two numbers
        int minValue = Math.min(5, 10);
        System.out.println("Minimum of 5 and 10: " + minValue);

        // Exponential function
        double expValue = Math.exp(1);
        System.out.println("Exponential of 1: " + expValue);

        // Power function
        double powerValue = Math.pow(2, 3);
        System.out.println("2 to the power of 3: " + powerValue);

        // Square root
        double sqrtValue = Math.sqrt(16);
        System.out.println("Square root of 16: " + sqrtValue);

        // Cube root
        double cbrtValue = Math.cbrt(27);
        System.out.println("Cube root of 27: " + cbrtValue);

        // Logarithm (base e)
        double logValue = Math.log(10);
        System.out.println("Natural logarithm of 10: " + logValue);

        // Logarithm (base 10)
        double log10Value = Math.log10(100);
        System.out.println("Logarithm base 10 of 100: " + log10Value);

        // Trigonometric functions
        double sinValue = Math.sin(Math.toRadians(30));
        System.out.println("Sine of 30 degrees: " + sinValue);

        double cosValue = Math.cos(Math.toRadians(60));
        System.out.println("Cosine of 60 degrees: " + cosValue);

        double tanValue = Math.tan(Math.toRadians(45));
        System.out.println("Tangent of 45 degrees: " + tanValue);

        // Radians to degrees
        double degrees = Math.toDegrees(Math.PI);
        System.out.println("PI radians in degrees: " + degrees);

        // Degrees to radians
        double radians = Math.toRadians(180);
        System.out.println("180 degrees in radians: " + radians);

        // Rounding functions
        double roundValue = Math.round(10.5);
        System.out.println("Round 10.5: " + roundValue);

        double ceilValue = Math.ceil(10.2);
        System.out.println("Ceiling of 10.2: " + ceilValue);

        double floorValue = Math.floor(10.8);
        System.out.println("Floor of 10.8: " + floorValue);

        // Random number
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);
    }
}
