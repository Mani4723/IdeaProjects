import java.util.Scanner;

/**
 *
 * Created by zemosozemoso on 18/7/17.
 */
public class CreditCard extends Payment {

    private double amount;
    private String bankName;
    private long cardNum;
    private String cardName;
    private Integer cvv;

    CreditCard(double amount) {
        setName("Credit Card");
        bankName = "";
        cardNum = 0;
        cardName = "";
        cvv = 0;
        this.amount = amount;
    }

    @Override
    public void makePayment() {

        try (Scanner scan = new Scanner(System.in)){

            System.out.print("Please select the Bank[PNB/SBI/Kotak/ICICI/CITI/others]: ");
            if (scan.hasNext()) {
                bankName = scan.next();
            }
            System.out.print("Enter the Credit Card number: ");
            if (scan.hasNext()) {
                cardNum = Long.parseLong(scan.next());
            }
            System.out.print("Enter the name of Credit Card owner: ");
            if (scan.hasNext()) {
                cardName = scan.next();
            }
            System.out.print("Enter cvv: ");
            if (scan.hasNext()) {
                cvv = Integer.parseInt(scan.next());
            }

            System.out.println("From " + cardName + "'s "+ bankName + " bank account, amount of " +
                    amount + " will be transacted using Credit card " +
                    cardNum);
        } catch (Exception e) {
            System.out.println("Your Credit Card number or cvv is wrong.");
            System.out.print("Transaction Failed.");

        }

    }

}
