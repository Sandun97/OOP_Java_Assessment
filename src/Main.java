
public class Main {

    public static void main(String[] args) {

        Payment p1 = new CashOnDelivery(2500, "LKR", "123 Main Street");
        p1.processPayment();
        p1.generateReceipt();
        System.out.println("-----------------------------------");

        Payment p2 = new BankTransfer(15000, "LKR", "ABC Bank", "1234567890", "REF2025");
        p2.processPayment();
        p2.generateReceipt();
        System.out.println("-----------------------------------");

        Payment p3 = new CreditCardPayment(5000, "USD", "4111111111111111",
                "John Doe", "12/27", 10000);
        p3.processPayment();
        p3.generateReceipt();
        System.out.println("-----------------------------------");

        Payment p4 = new DebitCardPayment(3000, "USD", "5500000000000004",
                "Jane Smith", "10/26", 4000);
        p4.processPayment();
        p4.generateReceipt();
        System.out.println("-----------------------------------");


    }


}