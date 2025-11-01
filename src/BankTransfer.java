public class BankTransfer extends Payment {

    public String bankName;
    public String accountNumber;
    public String referenceCode;

    public BankTransfer(double amount, String currency, String bankName,
                        String accountNumber, String referenceCode) {
        super(amount, currency);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;
    }

    @Override
    public void processPayment(){
        System.out.println("Initiating bank transfer to "+this.bankName+" using account "+this.accountNumber+" with reference "+this.referenceCode);
        markAsCompleted();
    }

}
