package payment;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " From using " + getPaymentDetails());
    }
    @Override
    public String getPaymentDetails() {
        return "BitcoinPayment [Wallet Address: " + walletAddress + "]";
    }
}
