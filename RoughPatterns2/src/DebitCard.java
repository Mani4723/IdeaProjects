import java.util.Scanner;

/**
 *
 * Created by zemosozemoso on 18/7/17.
 */
public class DebitCard extends Payment {

    private double amount;
    private String bankName;
    private long cardNum;
    private String cardName;
    private int cvv;

    DebitCard(double amount) {
        setName("Credit Card");
        bankName = "";
        cardNum = 0;
        cardName = "";
        cvv = 0;
        this.amount = amount;
    }

    @Override
    public void makePayment() {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Please select the Bank[PNB/SBI/Kotak/ICICI/CITI/others]:");
            if (scan.hasNext()) {
                bankName = scan.next();
            }
            System.out.print("Enter the Debit Card number: ");
            if (scan.hasNext()) {
                cardNum = Long.parseLong(scan.next());
            }
            System.out.print("Enter the name of Debit Card owner: ");
            if (scan.hasNext()) {
                cardName = scan.next();
            }
            System.out.print("Enter cvv: ");
            if (scan.hasNext()) {
                cvv = Integer.parseInt(scan.next());
            }

            System.out.println("From " + bankName + " bank amount of " +
                    amount + " will be transacted using Debit card " +
                    cardNum + " and name " + cardName);

        } catch (Exception e) {
            System.out.println("Your Credit Card number or cvv is wrong.");
            System.out.print("Transaction Failed.");
        }

    }
}
