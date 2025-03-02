package payment;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " From using " + getPaymentDetails());
    }
    @Override
    public String getPaymentDetails() {
        return "CreditCardPayment [Card Number: " + cardNumber + ", Card Holder: " + cardHolderName + "]";
    }
}
