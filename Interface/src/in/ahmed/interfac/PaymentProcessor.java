package in.ahmed.interfac;

public interface PaymentProcessor {
	
    boolean processPayment(double amount);
    
    String getPaymentStatus(long transactionId); 
}
