public class BloodData {
    private String bloodType;
    private String rhFactor;

    
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    
    public String getBlood() {
        return bloodType;
    }

   
    public void setBlood(String bloodType) {
        this.bloodType = bloodType;
    }

   
    public String getRH() {
        return rhFactor;
    }

   
    public void setRH(String rhFactor) {
        this.rhFactor = rhFactor;
    }

   
    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    
    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
