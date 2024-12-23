package Abstraction;

// Define the interface
interface PaymentMethod {
    // Interface fields (constants)
    String CREDIT_CARD = "Credit Card";
    String DEBIT_CARD = "Debit Card";
    String PAYPAL = "PayPal";

    // Abstract methods
    void processPayment(double amount);
    void cancelPayment();
}

// Implement the interface for Credit Card payment
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + CREDIT_CARD + " payment of $" + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Canceling " + CREDIT_CARD + " payment.");
    }
}

// Implement the interface for PayPal payment
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + PAYPAL + " payment of $" + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Canceling " + PAYPAL + " payment.");
    }
}


public class Main_Interface {
    public static void main(String[] args) {
        // Create objects using the interface reference
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();

        // Use Credit Card payment
        creditCardPayment.processPayment(150.75); // Processing Credit Card payment of $150.75
        creditCardPayment.cancelPayment();        // Canceling Credit Card payment.

        // Use PayPal payment
        payPalPayment.processPayment(200.00);    // Processing PayPal payment of $200.00
        payPalPayment.cancelPayment();           // Canceling PayPal payment.

        // Access interface fields
        System.out.println("Supported Payment Methods:");
        System.out.println(PaymentMethod.CREDIT_CARD);
        System.out.println(PaymentMethod.DEBIT_CARD);
        System.out.println(PaymentMethod.PAYPAL);
    }
}
