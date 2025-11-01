public class DebitCardPayment extends CardPayment{

    private double availableBalance;

    public DebitCardPayment(double amount, String currency, String cardNumber,
                            String cardHolderName, String expiryDate, double availableBalance) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from account balance " + this.availableBalance +
                " for amount " + this.amount);
    }

    public void checkSufficientBalance() {
        System.out.println("Checking if balance covers amount.");
    }

}
