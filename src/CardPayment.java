public class CardPayment extends Payment {

    protected String cardNumber;
    protected String cardHolderName;
    protected String expiryDate;

    public CardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean validate() {
        return this.cardNumber != null && !this.cardHolderName.isEmpty() && !this.expiryDate.isEmpty();
    }

    @Override
    public boolean processPayment() {
        if (validate()) {
            System.out.println("Authorizing card payment for " + cardHolderName + "...");
            return true;
        }
        System.out.println("Card validation failed!");
        return false;
    }


}
