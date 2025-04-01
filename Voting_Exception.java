// Custom exception class
class DollyException extends Exception {
    public DollyException(String msg) { // Constructor
        super(msg);
    }
}

public class Voting_Exception {
    public static void main(String[] args) {
        int age = 19; // Example age

        try {
            if (age < 18) {
                throw new DollyException("You are not eligible to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (DollyException e) {
            System.out.println("My Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Voting eligibility check completed.");
        }
    }
}
