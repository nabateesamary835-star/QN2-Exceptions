public class RiskyMethod {
    public static int risky(int x) {
        try {
            System.out.println("In try block with x = " + x);
            if (x == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return 10 / x;
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            return 20;
        } finally {
            System.out.println("Finally block always executes for x = " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Testing risky(0) ===");
        int result0 = risky(0);
        System.out.println("Caller received: " + result0);

        System.out.println("\n=== Testing risky(2) ===");
        int result2 = risky(2);
        System.out.println("Caller received: " + result2);
    }
}