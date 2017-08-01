import java.util.Scanner;

/**
 * Created by zemosozemoso on 18/7/17.
 */
public class COD extends Payment {
    private double amount;
    private String mobileNumber;
    private String otp;

    public COD(double amount){
        setName("Cash on delivery");
        mobileNumber = "";
        otp = "";
        this.amount = amount;
    }

    @Override
    public Transaction makePayment(){

        try (Scanner scanner = new Scanner(System.in))
        {
            double amt = 0;

            System.out.print("Enter Mobile Number:");
            if(scanner.hasNextLine())
                mobileNumber = scanner.nextLine();

            System.out.print("Enter One Time Password:");
            if(scanner.hasNextLine())
                otp = scanner.nextLine();

            System.out.println("Please pay " + amount + " at the time of Delivery.");

            addAmount(amount);
            return new Transaction(this,amount);
        }
    }
}
