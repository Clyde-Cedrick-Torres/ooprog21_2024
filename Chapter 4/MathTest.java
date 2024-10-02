public class MathTest {
    public static void main(String[] args) {
        
        double number = 37.0;
        double sqrtValue = Math.sqrt(number);
        double sinValue = Math.sin(number);
        double cosValue = Math.cos(number);

        double floorValue = Math.floor(number);
        double ceilValue = Math.ceil(number);
        long roundValue = Math.round(number);

        int maxValue = Math.max(55, 78);
        int minValue = Math.min(22, 34);

        double randomValue = Math.random() * 100; 

        System.out.println("sqrt: " + sqrtValue);
        System.out.println("sin: " + sinValue);
        System.out.println("cos: " + cosValue);
        System.out.println("floor: " + floorValue);
        System.out.println("ceil: " + ceilValue);
        System.out.println("round: " + roundValue);
        System.out.println("max: " + maxValue);
        System.out.println("min: " + minValue);
        System.out.println("random: " + randomValue);
    }
}
