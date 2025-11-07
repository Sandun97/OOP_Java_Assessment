public class DebitCardPayment extends CardPayment implements Discount{

    private final double availableBalance;
    private double discountedAmount;

    public DebitCardPayment(double amount, String currency, String cardNumber,
                            String cardHolderName, String expiryDate, double availableBalance) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public double applyDiscount(double percent) {
        this.discountedAmount = amount - (amount * percent / 100);
        return this.discountedAmount;
    }

    @Override
    public double finalAmount() {
        return discountedAmount;
    }

    @Override
    public boolean processPayment() {
        if (validate()) {
            System.out.println("Debiting from account balance " + this.availableBalance +
                    " for amount " + this.amount);
            return true;
        }
        System.out.println("Debit Card validation failed!");
        return false;
    }
}
