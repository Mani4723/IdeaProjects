import java.util.Scanner;

/**
 *
 *
 * Created by zemosozemoso on 18/7/17.
 */
public class NetBanking extends Payment {

    private double amount;
    private String bankName;
    private String loginID;
    private String password;

    NetBanking(double amount) {
        setName("Credit Card");
        bankName = "";
        loginID = "";
        password = "";
        this.amount = amount;
    }

    public void makePayment() {

        try (Scanner scan = new Scanner(System.in)){

            System.out.print("Please select the Bank[PNB/SBI/Kotak/ICICI/CITI/others]: ");
            if (scan.hasNext()) {
                bankName = scan.next();
            }
            System.out.print("Please enter the loginID: ");
            if (scan.hasNext()) {
                loginID = scan.next();
            }
            System.out.print("Please enter the password: ");
            if (scan.hasNext()) {
                password = scan.next();
            }

            System.out.println("From " + bankName + " bank amount of " +
                    amount + " will be transacted using Net banking " +
                    loginID);
        } catch (Exception e) {
            System.out.println("Invalid loginID or Password.");
            System.out.print("Transaction Failed.");
        }
    }
}
