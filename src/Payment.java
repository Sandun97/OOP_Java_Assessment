import java.util.UUID;

public abstract class Payment implements Payable{

    public double amount;
    public String currency;
    public String status;
    public String referenceId;

    public Payment(double amount, String currency){
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
        this.referenceId = "TXN-" + UUID.randomUUID().toString().substring(0, 6);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public abstract boolean processPayment();

    public void generateReceipt(){
        System.out.println("Receipt for amount "+this.amount+" currency "+this.currency);
    }

    public void markAsCompleted(){
        status = "COMPLETED";
        System.out.println("Payment status updated to COMPLETED.");
    }

    public String getReference(){
        return this.referenceId;
    }



}
