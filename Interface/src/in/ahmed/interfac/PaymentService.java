package in.ahmed.interfac;

public class PaymentService {

    /*
     * Here payment service has a payment processor object.
     * The interface reference variable can hold the implementation class object.
     */
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void executePayment(double amount) {
        boolean flag = paymentProcessor.processPayment(amount);
        if (flag) {
            System.out.println("Payment processed successfully");
        } else {
            System.out.println("Payment failed");
        }
    }

    public void checkTransactionStatus(long transactionId) {
        String paymentStatus = paymentProcessor.getPaymentStatus(transactionId);
        System.out.println("Check Payment Status: " + paymentStatus);
    }
}
