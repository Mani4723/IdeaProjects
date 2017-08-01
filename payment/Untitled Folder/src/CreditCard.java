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
                    amount + " will be transacted using Credit card " +
                    cardNum + " and name " + cardName);

            addAmount(amount);
            return new Transaction(this, amount);
        }

    }

}
