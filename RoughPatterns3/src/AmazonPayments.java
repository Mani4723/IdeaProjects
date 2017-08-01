import java.util.*;
public class AmazonPayments {
    public static void main(String[] args){
        PaymentPortal portal = new PaymentPortal();
        portal.pay();
        System.out.println("Total Amount Transacted: " + portal.toString());
    }
}
