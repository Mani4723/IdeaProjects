import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Question: Given the signup date and the current date, provide the allowable date range
 * for the KYC form date.
 * @author manikanta
 * Created by zemosozemoso on 11/7/17.
 */

public class KycForm {
    public static void main(String[] args) throws ParseException {
        String input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        System.out.println(dateRange(input));
        scan.close();
    }


    /**
     * @param input Input string contains Singup date, Current date. Format E.g: 16-06-2016 21-07-2018
     * @throws ParseException When trying to parse a String to a Date Object. The string should have
     * a specified format.Otherwise, java.text.ParseException will be thrown.
     */
    public static String dateRange (String input) throws ParseException {

        String singup = input.substring(0, 10);
        String current = input.substring(11);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Calendar singupDate = new GregorianCalendar();    /* new calender objects. */
        Calendar currentDate = new GregorianCalendar();

        singupDate.setTime(sdf.parse(singup));     /* converting string to calender. */
        currentDate.setTime(sdf.parse(current));

        /* creating new calenders for +/- 30 day range. */
        Calendar firstDay = new GregorianCalendar();
        Calendar lastDay = new GregorianCalendar();

        /* copying all the values of singup date except year, year is from current date. */
        firstDay.set(Calendar.DATE, singupDate.get(Calendar.DATE));
        lastDay.set(Calendar.DATE, singupDate.get(Calendar.DATE));
        firstDay.set(Calendar.MONTH, singupDate.get(Calendar.MONTH));
        lastDay.set(Calendar.MONTH, singupDate.get(Calendar.MONTH));
        firstDay.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
        lastDay.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));

        firstDay.add(Calendar.DATE, -30);
        lastDay.add(Calendar.DATE, 30);


        /* Cases: 1. Before singup date and first anniversary Lower range date - No range.
        *         2. Equals the lower range or higher range dates.
        *         3. Between the Anniversary range.
        *         4. After Anniversary range.
        *         5. Before the Anniversary range.
        * */

        if(currentDate.before(singupDate)){
            return "No Range";

        } else if(currentDate.equals(firstDay)) {
            return (sdf.format(firstDay.getTime()) + " " + sdf.format(firstDay.getTime()));

        }else if(currentDate.after(firstDay) && currentDate.before(lastDay)){
            return (sdf.format(firstDay.getTime()) + " " + sdf.format(currentDate.getTime()));

        }else if(currentDate.equals(lastDay)){
            return (sdf.format(lastDay.getTime()) + " " + sdf.format(lastDay.getTime()));

        }else if(currentDate.after(lastDay)){
            return (sdf.format(firstDay.getTime()) + " " + sdf.format(lastDay.getTime()));

        }else if(currentDate.before(firstDay)){
            firstDay.add(Calendar.YEAR, -1);
            lastDay.add(Calendar.YEAR, -1);
            return (sdf.format(firstDay.getTime()) + " " + sdf.format(lastDay.getTime()));
        }
        return "No Range";

    }


}