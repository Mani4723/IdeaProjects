import java.util.Scanner;

/**
 * Created by zemosozemoso on 17/7/17.
 */
public class PaymentDemo {
    public static void main(String[] args) {
        double amount;
        PaymentFactory paymentFactory = new PaymentFactory();

        Payment netPayment = paymentFactory.paymentType("NetBanking", amount);

        netPayment.makePayment();
    }

    public void pay(double amount){
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = new Transaction();
        PaymentFactory paymentFactory = new PaymentFactory();
        while(true){
            System.out.print("Enter Mode of Payment(CC/DC/W/NB/COD):");
            Payment payment = null;
            if(scanner.hasNextLine()){
                String modeType = scanner.nextLine();
                if(modeType.equals("")){
                    System.out.println();
                    return;

                }
                payment = paymentFactory.paymentType(modeType, amount);
            }
            transactions.add(payment.makePayment());
            System.out.println("Transaction approved using " + payment + " for " + transactions.get(transactions.size()-1).getAmount());
        }
    }
}
