/**
 * Created by zemosozemoso on 18/7/17.
 */
public abstract class Payment {
    private Double amount;
    private String paytype;


    public abstract void makePayment();

    public void setName(String type) {
        this.paytype = type;
        amount = 0.0;
    }

}
