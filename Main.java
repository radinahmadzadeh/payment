import payment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Customer Information =====");
        System.out.println("\n");

        Customer customer1 = new RegularCustomer("Ali");
        Customer customer2 = new RegularCustomer("Mmd");
        Customer customer3 = new PremiumCustomer("Gholi");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        System.out.println("\n===== Processing Payments =====");
        System.out.println("\n");

        PaymentStrategy creditCard = new CreditCardPayment("1234567899876543", "Ali");
        PaymentStrategy paypal = new PayPalPayment("Mmd@yahoo.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1A2B3C4D5E6F7G8H");

        customer1.makePayment(creditCard, 25);
        customer1.makePayment(paypal, 100);

        customer2.makePayment(paypal, 30);
        customer2.makePayment(bitcoin, 200);

        customer3.makePayment(bitcoin, 45);
        customer3.makePayment(creditCard, 125);

        System.out.println("\n===== Payment Histories =====\n");

        customer1.showPaymentHistory();
        System.out.println("\n");
        customer2.showPaymentHistory();
        System.out.println("\n");
        customer3.showPaymentHistory();
    }
}
