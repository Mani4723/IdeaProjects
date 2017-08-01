import java.util.Scanner;

/**
 * Created by zemosozemoso on 17/7/17.
 */
public class NetBanking extends Payment {


    private String bankName;
    private String loginID;
    private String password;


    public NetBanking() {
        setName("Credit Card");
        bankName = "";
        cardNum = 0;
        cardName = "";
        cvv = 0;
    }

    public Transaction makePayment() {
        double amt = 0;
        System.out.println("Made payment " + amount + " using Credit card.");
        try (Scanner scan = new Scanner(System.in)){

            System.out.println("Please select the Bank");
            if (scan.hasNextLine()) {
                bankName = scan.nextLine();
            }
            System.out.println("Enter the Credit Card number: ");
            if (scan.hasNextLine()) {
                cardNum = Long.parseLong(scan.next());
            }
            System.out.println("Enter the name of Credit Card owner: ");
            if (scan.hasNextLine()) {
                cardName = scan.nextLine();
            }
            System.out.println("Enter cvv: ");
            if (scan.hasNextLine()) {
                cvv = Integer.parseInt(scan.next());
            }

            System.out.println("From Bank " + bankName + " amount of " +
                    amt + " will be transacted using Credit card " +
                    cardNum + " and name " + cardName);

            addAmount(amt);
            return new Transaction(this, amt);
        }



}
