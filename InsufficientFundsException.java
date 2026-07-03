public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(double balance, double requested) {
        super(String.format("Insufficient funds. Available: %.2f, Requested: %.2f", balance, requested));
    }
}
