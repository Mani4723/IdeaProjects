import java.util.Scanner;

/**
 *
 * Created by zemosozemoso on 18/7/17.
 */
public class Wallet extends Payment {

    private double amount;
    private String walletName;
    private String loginID;
    private String password;

    public Wallet(double amount) {
        setName("Wallet");
        walletName = "";
        loginID = "";
        password = "";
        this.amount = amount;

    }

    @Override
    public Transaction makePayment() {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Please select the Wallet [Paytm/FreeCharge/MobiKwik]: ");
            if (scan.hasNext()) {
                walletName = scan.next();
            }
            System.out.print("Enter the loginID: ");
            if (scan.hasNext()) {
                loginID = scan.next();
            }
            System.out.print("Enter the password: ");
            if (scan.hasNext()) {
                password = scan.next();
            }

            System.out.println("From Wallet " + walletName + " amount of " +
                    amount + " will be transacted using " + loginID);

            addAmount(amount);
            return new Transaction(this, amount);

        }
    }
}
