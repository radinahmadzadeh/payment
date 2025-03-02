package payment;

import java.util.ArrayList;

public abstract class Customer {
    protected String name;
    protected ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }
    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add("Paid " + amount + " From " + paymentStrategy.getPaymentDetails());
    }
    public void showPaymentHistory() {
        System.out.println("Payment History " + name );
        for (String record : paymentHistory) {
            System.out.println(record);
        }
    }
}
