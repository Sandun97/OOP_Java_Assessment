public class CashOnDelivery extends Payment{

    public String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String deliveryAddress){
        super(amount,currency);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public boolean validate() {
        return amount > 0;
    }

    @Override
    public boolean processPayment() {
        if (validate()) {
            System.out.println("Cash will be collected at delivery address: " + deliveryAddress);
            return true;
        }
        System.out.println("COD validation failed!");
        return false;
    }
}
