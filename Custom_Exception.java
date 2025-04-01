class DollyException extends Exception {
    public DollyException(String msg) { // Constructor
        super(msg);
    }
}


public class Custom_Exception {
    public static void main(String[] args) {
        try {
            
            throw new DollyException("Our msg");
        } 
        catch (DollyException e) {
            
            System.out.println("My Custom Error: " + e.getMessage());
        } 
        finally {
            
            System.out.println("My Custom Error is created");
        }
    }
}