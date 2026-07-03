import java.io.*;

public class FileResourceDemo {
    public static void main(String[] args) {
        System.out.println("=== Try-with-Resources Demo ===");
        try (FileReader reader = new FileReader("sample.txt")) {  // auto-closed
            System.out.println("Reading file...");
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
        // No need for finally block - resource is always closed
    }
}
