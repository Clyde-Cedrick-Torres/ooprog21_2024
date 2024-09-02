import java.util.Scanner;

public class SammysRentalPrice {

   
    public static void displayMotto() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun!  S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }

      

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        displayMotto();
      
        System.out.print("Enter the number of minutes rented a piece of sports equipment: ");
        int minutesRented = scanner.nextInt();

        
        int hours = minutesRented / 60;
        int extraMinutes = minutesRented % 60;

        
        int totalPrice = (hours * 40) + extraMinutes;

       
        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes rented: " + extraMinutes);
        System.out.println("The Total price is : $" + totalPrice);
       
        
      
        
        scanner.close();
    }
}
