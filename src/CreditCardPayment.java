public class CreditCardPayment extends CardPayment implements Discount{

    private double creditLimit;
    private double discountedAmount;

    public CreditCardPayment(double amount, String currency, String cardNumber,
                             String cardHolderName, String expiryDate, double creditLimit) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.creditLimit = creditLimit;
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
            System.out.println("Charging credit card with limit " + creditLimit + " for amount " + amount);
            return true;
        }
        System.out.println("Credit Card validation failed!");
        return false;
    }

    public void applyInterest() {
        System.out.println("Applying interest if payment is not settled by due date.");
    }

}
