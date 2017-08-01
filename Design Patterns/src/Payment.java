/**
 * Created by zemosozemoso on 17/7/17.
 */
public abstract class Payment {
    private Double amount;
    private String name;


    public abstract  void makePayment();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        amount = 0.0;
    }

    public void addAmount(Double amount) {
        this.amount += amount;
    }
}
