public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn sleepChecker = new SleepIn();
        
       
        System.out.println(sleepChecker.sleepIn(false, false)); 
        System.out.println(sleepChecker.sleepIn(true, false));  
        System.out.println(sleepChecker.sleepIn(false, true));  
        System.out.println(sleepChecker.sleepIn(true, true));   
    }
}
