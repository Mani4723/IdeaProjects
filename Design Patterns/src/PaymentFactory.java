/**
 * Created by zemosozemoso on 17/7/17.
 */
public class PaymentFactory {

    public Payment paymentType(String type, long amount) {
        if (type.equalsIgnoreCase("CreditCard")) {
            return new CreditCard();

        } else if (type.equalsIgnoreCase("DebitCard")) {
            return new DebitCard();

        } else if (type.equalsIgnoreCase("Wallet")) {
            return new Wallet();

        } else if (type.equalsIgnoreCase("NetBanking")) {
            return new NetBanking();

        } else if (type.equalsIgnoreCase("COD")) {
            return new COD();
        } else {
            return null;
        }
    }
}
