import java.util.Scanner;

/**
 *
 * @author Manikanta
 * Created by zemosozemoso on 18/7/17.
 */
public class COD extends Payment {
    private double amount;
    private long mobileNumber;
    private long otp;

    COD(double amount){
        setName("Cash on delivery");
        mobileNumber = 0;
        otp = 0;
        this.amount = amount;
    }

    @Override
    public void makePayment(){

        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Enter Mobile Number:");
            if(scanner.hasNext())
                mobileNumber = Long.parseLong(scanner.next());

            System.out.print("Enter One Time Password:");
            if(scanner.hasNext())
                otp = Long.parseLong(scanner.next());

            System.out.println("Please pay " + amount + " at the time of Delivery.");
        } catch (Exception e) {
            System.out.println("Invalid Mobile number or OTP.");
            System.out.print("Transaction Failed.");
        }

    }
}
