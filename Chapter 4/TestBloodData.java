import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         BloodData patient = new BloodData();

      
        System.out.println("ENTER YOUR BLOOD TYPE: ");
        String bloodType = scanner.nextLine();

        System.out.println("ENTER THE Rh Factor: ");
        String rhFactor = scanner.nextLine();
        patient.setBlood(bloodType);
        patient.setRH(rhFactor);

         patient.displayBloodInfo();

         scanner.close();
    }
}
