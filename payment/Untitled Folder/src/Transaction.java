import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manikanta
 * Created by zemosozemoso on 18/7/17.
 */
public class Transaction {

    private double totalAmount = 0;
    private Payment payment;
    private Double amount;
    private List<Transaction> transactions = new ArrayList<>();

    Transaction(Payment payment, double amount){
        this.payment = payment;
        this.amount = amount;
        transactions.add(payment.makePayment());
    }

    void addTransaction(Payment newPayment) {
        transactions.add(newPayment.makePayment());
    }

    public void addAmount(Double amount) {
        totalAmount += amount;
    }

    public Payment getPayment(){
        return payment;
    }
    Double getAmount(){
        return amount;
    }
    public String toString(){
        return getPayment() + " " + getAmount();
    }
}
