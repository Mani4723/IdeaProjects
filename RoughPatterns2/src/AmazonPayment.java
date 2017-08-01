import java.util.Scanner;

/**
 *
 * @author Manikanta.
 * Created by zemosozemoso on 18/7/17.
 */
public class AmazonPayment {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double amount = 0;
            String payType = "";
            PaymentFactory paymentFactory = new PaymentFactory();

            System.out.print("Enter Mode of Payment(CC/DC/W/NB/COD):");
            if (scanner.hasNextLine()) {
                payType = scanner.nextLine();
                if (payType.equals("")) {
                    System.out.println();
                }
            }

            System.out.print("Enter amount: ");
            if (scanner.hasNextLine()) {
                amount = scanner.nextDouble();
            }

            Payment newPayment = paymentFactory.paymentType(payType, amount);
            newPayment.makePayment();

        } catch (Exception e) {
            System.out.print("Invalid Payment Mode or amount.");
        }
    }
}
