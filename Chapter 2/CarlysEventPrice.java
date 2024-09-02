import java.util.Scanner;

public class CarlysEventPrice {

    
    public static void displayMotto() {
        System.out.println("******************************************");
        System.out.println("* Carly's makes the food that makes it a party! *");
        System.out.println("******************************************");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         displayMotto();
        
        System.out.print("Input the number of guests attending: ");
        int guests = scanner.nextInt();

        int pricePerGuest = 35;
        int totalPrice = guests * pricePerGuest;

       
        System.out.println("The Number of guests: " + guests);
        System.out.println("The Price per guest is: $" + pricePerGuest);
        System.out.println("The Total price is: $" + totalPrice);
        System.out.println("Is it a large event?: " + (guests >= 50));
           
        
      
        scanner.close();
    }
}
