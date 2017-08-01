import java.util.Scanner;

/**
 * Created by zemosozemoso on 17/7/17.
 */
public class COD extends Payment {

    private String mobileNumber;
    private String oTP;

    public COD() {
        setName("Cash on delivery");
        mobileNumber = "";
        oTP = "";
    }

    public Transaction makePayment() {

        try (Scanner scanner = new Scanner(System.in)) {
            double amt = 0;
            System.out.print("Enter Mobile Number:");
            if (scanner.hasNextLine())
                mobileNumber = scanner.nextLine();
            System.out.print("Enter One Time Password:");
            if (scanner.hasNextLine())
                oTP = scanner.nextLine();

            /*System.out.println("From Bank " + bankName + " amount of " +
                    amt + " will be transacted using Credit card " +
                    cardNum + " and name " + cardName);*/

            System.out.println("");
            addAmount(amt);
            return new Transaction(this, amt);
        }
    }
}