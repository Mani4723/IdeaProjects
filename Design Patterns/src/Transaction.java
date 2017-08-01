/**
 * Created by zemosozemoso on 18/7/17.
 */
public class Transaction {
    private Payment payment;
    private Double amount;

    public Transaction(Payment payment, Double amount){
        this.payment = payment;
        this.amount = amount;
    }

    public Payment getPaymentMode(){
        return payment;
    }
    public Double getAmount(){
        return amount;
    }
    public String toString(){
        return getPaymentMode() + " " + getAmount();
    }
}
