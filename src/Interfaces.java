import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface PaymentGateway {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.printf("\nProcessing credit card payment of %.2f\n", amount);
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing UPI payment of %.2f\n", amount);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        List<String> paymentMethods = new ArrayList<>(Arrays.asList("credit", "upi"));
        List<Double> amounts = new ArrayList<>(Arrays.asList(284.5, 27476.2));

        for (int j = 0; j < paymentMethods.size(); j++) {
        
            PaymentGateway payment = null;

            String method = paymentMethods.get(j);
            if (method.equalsIgnoreCase("credit")) {
                payment = new CreditCardPayment();
            } else if (method.equalsIgnoreCase("upi")) {
                payment = new UPIPayment();
            }

            payment.processPayment(amounts.get(j));
        }

        scanner.close();
    }
}
