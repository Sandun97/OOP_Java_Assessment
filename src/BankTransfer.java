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
    public boolean validate() {
        return this.bankName != null && !this.accountNumber.isEmpty();
    }

    @Override
    public boolean processPayment(){
        if (validate()) {
            status = "CARD PAYMENT SUCCESS";
            System.out.println("Initiating bank transfer to " + this.bankName + " using account " + this.accountNumber + " with reference " + this.referenceCode);
            markAsCompleted();
            return true;
        }
        System.out.println("Bank transfer validation failed!");
        return false;
    }

}
