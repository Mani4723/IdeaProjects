import java.util.*;

public class PaymentPortal{

    private List<Transaction> transactions;
    public PaymentPortal(){
        transactions = new ArrayList<Transaction>();
    }

    public PaymentMode makeMode(String paymentType){
        if(paymentType.equals("DC"))
            return new DebitCard();
        if(paymentType.equals("CC"))
            return new CreditCard();
        if(paymentType.equals("COD"))
            return new COD();
        if(paymentType.equals("W"))
            return new Wallets();
        if(paymentType.equals("NB"))
            return new NetBanking();
        return null;
    }

    public void pay(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Mode of Payment(CC/DC/W/NB/COD):");
            PaymentMode paymentMode = null;
            if(scanner.hasNextLine()){
                String modeType = scanner.nextLine();
                if(modeType.equals("")){
                    System.out.println();
                    return;
                }
                paymentMode = makeMode(modeType);
            }
            transactions.add(paymentMode.pay());
            System.out.println("Transaction approved using " + paymentMode + " for " + transactions.get(transactions.size()-1).getAmount());
        }
    }

    public String toString(){
        return "Amazon Payments";
    }
}
