/**
 * Created by zemosozemoso on 18/7/17.
 */
public abstract class Payment {
    private Double amount;
    private String paytype;


    public abstract Transaction makePayment();

    public void setName(String type) {
        this.paytype = type;
        amount = 0.0;
    }

    public void addAmount(Double amount) {
        this.amount += amount;
    }

    public String toString() {
        return paytype;
    }
}
