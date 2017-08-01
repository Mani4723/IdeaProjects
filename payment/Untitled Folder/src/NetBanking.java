import java.util.Scanner;

/**
 * Created by zemosozemoso on 18/7/17.
 */
public class NetBanking extends Payment {

    private double amount;
    private String bankName;
    private String loginID;
    private String password;

    public NetBanking(double amount) {
        setName("Credit Card");
        bankName = "";
        loginID = "";
        password = "";
        this.amount = amount;
    }

    public Transaction makePayment() {
        double amt = 0;
        System.out.println("Made payment " + amount + " using Credit card.");
        try (Scanner scan = new Scanner(System.in)){

            System.out.println("Please select the Bank");
            if (scan.hasNextLine()) {
                bankName = scan.nextLine();
            }
            System.out.println("Please enter the loginID");
            if (scan.hasNextLine()) {
                loginID = scan.nextLine();
            }
            System.out.println("Please enter the password.");
            if (scan.hasNextLine()) {
                password = scan.nextLine();
            }

            System.out.println("From Bank " + bankName + " amount of " +
                    amount + " will be transacted using Net banking " +
                    loginID);

            addAmount(amount);
            return new Transaction(this, amount);
        }
    }
}
