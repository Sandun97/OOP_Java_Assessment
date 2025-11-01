public class Payment {

    public double amount;
    public String currency;
    public String status;

    public Payment(double amount, String currency){
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
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

    public void processPayment(){
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt(){
        System.out.println("Receipt for amount "+this.amount+" currency "+this.currency);
    }

    public void markAsCompleted(){
        status = "COMPLETED";
        System.out.println("Payment status updated to COMPLETED.");
    }

}
