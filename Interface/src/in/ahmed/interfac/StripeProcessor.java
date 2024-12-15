package in.ahmed.interfac;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Payment Through Stripe: $" + amount);
        return true;
    }

    @Override
    public String getPaymentStatus(long transactionId) {
        System.out.println("Getting Stripe payment status for transaction: " + transactionId);
        return "Success";
    }
}
