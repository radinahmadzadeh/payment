This project simulates a simple business application where customers can make payments using various methods (credit card, PayPal, Bitcoin).

The PaymentStrategy interface defines two methods: pay() for processing payments and getPaymentDetails() for returning payment details as a string.
Three classes represent different payment methods: CreditCardPayment, PayPalPayment, and BitcoinPayment. Each of these classes implements the PaymentStrategy interface, providing specific logic for each payment method.
The Customer class is abstract, containing information about the customer and their payment history. It has methods like displayCustomerInfo() and makePayment(), which are implemented in its subclasses RegularCustomer and PremiumCustomer.
In the Main class, customers (both regular and premium) are created, and payment methods (credit card, PayPal, Bitcoin) are assigned. Payments are processed, and the payment history of each customer is displayed.
