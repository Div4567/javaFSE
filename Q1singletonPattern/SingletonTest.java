package Q1singletonPattern;
public class SingletonTest {
    
    public static void main(String[] args) {
        System.out.println("--- Testing Singleton Pattern ---");

        // Request the Logger instance twice
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the loggers to print messages
        logger1.log("Application started.");
        logger2.log("Processing user request.");

        System.out.println("\n--- Verification ---");
        
        // Verify that both variables point to the exact same memory location
        if (logger1 == logger2) {
            System.out.println("SUCCESS: logger1 and logger2 hold the same instance.");
            System.out.println("Hashcode for logger1: " + logger1.hashCode());
            System.out.println("Hashcode for logger2: " + logger2.hashCode());
        } else {
            System.out.println("FAILURE: Multiple instances were created!");
        }
    }
}