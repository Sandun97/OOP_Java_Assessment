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
    public void processPayment() {
        validateCard();
        System.out.println("Authorizing card payment for " + cardHolderName + "...");
    }

    public void validateCard() {
        System.out.println("Validating card number format...");
    }

}
