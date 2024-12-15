package in.ahmed.interfac;

public class PaypalProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) { 
        System.out.println("Processing Payment Through Paypal: $" + amount);
        return true;
    }

    @Override
    public String getPaymentStatus(long transactionId) { 
        System.out.println("Getting Paypal payment status for transaction: " + transactionId);
        return "Success";
    }
}
