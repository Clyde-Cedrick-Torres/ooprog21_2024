public class Billing {

        private static double calculateTotal(double price, int quantity, int coupon) {
        double subtotal = (price * quantity) - coupon;
        return subtotal + (subtotal * 0.08);  
    }

      public static void computeBill(double price) {
        double total = calculateTotal(price, 1, 0);
        System.out.println("The total price for the bill is: " + total);
    }

        public static void computeBill(double price, int quantity) {
        double total = calculateTotal(price, quantity, 0);
        System.out.println("The total price for the bill is: " + total);
    }

   
    public static void computeBill(double price, int quantity, int coupon) {
        double total = calculateTotal(price, quantity, coupon);
        System.out.printf("The total price for the bill is: %.3f%n", total); 
    }

    public static void main(String[] args) {
        
        computeBill(23.5);             
        computeBill(23.2, 2);          
        computeBill(23.10, 3, 10);      
    }
}
