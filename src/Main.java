import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Payment p1 = new CashOnDelivery(2500, "LKR", "123 Main Street");
        Payment p2 = new BankTransfer(15000, "LKR", "ABC Bank", "1234567890", "REF2025");
        Payment p3 = new CreditCardPayment(5000, "USD", "4111111111111111",
                "John Doe", "12/27", 10000);
        Payment p4 = new DebitCardPayment(3000, "USD", "5500000000000004",
                "Jane Smith", "10/26", 4000);

        List<Payment> payments = new ArrayList<>();
        payments.add(p1);
        payments.add(p2);
        payments.add(p3);
        payments.add(p4);

        // Runtime Polymorphism!
        for (Payment payment : payments) {
            payment.processPayment();
            payment.generateReceipt();
            System.out.println("-----------------------------------");
        }
    }
}