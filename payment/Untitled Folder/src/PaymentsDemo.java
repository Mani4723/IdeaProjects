import java.util.Scanner;

/**
 * Created by zemosozemoso on 18/7/17.
 */
public class PaymentsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            double amount = 0;
            String modeType ="";
            PaymentFactory paymentFactory  = new PaymentFactory();
            System.out.print("Enter Mode of Payment(CC/DC/W/NB/COD):");
            //Payment newPayment = null;
            //Transaction newTransaction = null;
            if(scanner.hasNextLine()) {
                modeType = scanner.nextLine();
                if (modeType.equals("")) {
                    System.out.println();
                }
            }
            System.out.print("Enter amount: ");
            if (scanner.hasNextLine()) {
                amount = scanner.nextDouble();
            }

            Payment newPayment = paymentFactory.paymentType(modeType, amount);
            Transaction newTransaction = new Transaction(newPayment, amount);

            System.out.println("Transaction approved using " + newTransaction.getPayment() + " payment for " +
                    newTransaction.getAmount());
        }
    }
}
