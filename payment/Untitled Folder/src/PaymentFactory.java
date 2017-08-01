/**
 * Created by zemosozemoso on 18/7/17.
 */
public class PaymentFactory {

    public Payment paymentType(String type, double amount) {
        if (type.equalsIgnoreCase("CreditCard")) {
            return new CreditCard(amount);

        } else if (type.equalsIgnoreCase("DebitCard")) {
            return new DebitCard(amount);

        } else if (type.equalsIgnoreCase("Wallet")) {
            return new Wallet(amount);

        } else if (type.equalsIgnoreCase("NetBanking")) {
            return new NetBanking(amount);

        } else if (type.equalsIgnoreCase("COD")) {
            return new COD(amount);
        } else {
            return null;
        }
    }


}
