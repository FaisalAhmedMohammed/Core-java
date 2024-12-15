package in.ahmed.interfac;

public class Test {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService(new PaypalProcessor());
        ps.executePayment(50000);
        ps.checkTransactionStatus(12345);

        System.out.println("\nSwitching to Stripe Processor:");

        PaymentService stripeService = new PaymentService(new StripeProcessor());
        stripeService.executePayment(75000);
        stripeService.checkTransactionStatus(67890);
    }
}
