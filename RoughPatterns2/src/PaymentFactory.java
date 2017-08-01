/**
 *
 * Created by zemosozemoso on 18/7/17.
 */
public class PaymentFactory {

    Payment paymentType(String type, double amount) {
        if (type.equalsIgnoreCase("CC")) {
            return new CreditCard(amount);

        } else if (type.equalsIgnoreCase("DC")) {
            return new DebitCard(amount);

        } else if (type.equalsIgnoreCase("W")) {
            return new Wallet(amount);

        } else if (type.equalsIgnoreCase("NB")) {
            return new NetBanking(amount);

        } else if (type.equalsIgnoreCase("COD")) {
            return new COD(amount);
        } else {
            return null;
        }
    }


}
