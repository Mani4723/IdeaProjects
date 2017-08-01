import java.net.UnknownHostException;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.List;

/**
 * <h1>Java Assingment 3 </h1>
 * <p>Question: Write a java function that will ping any host ( given as input ) and computes the
 *    median of the time taken to ping.
 * </p>
 * @author: Manikanta
 * Created by zemosozemoso on 7/7/17.
 */

public class PingProgram {

    /**
     * @param cmd Website or Host you want to ping.
     * @param count Number of times to ping the given host command.
     * @throws UnknownHostException Thrown to indicate that the address of a host could not be determined.
     */
    static void command(String cmd, int count) throws UnknownHostException {
        try {

            Process p = Runtime.getRuntime().exec("ping -c"+ count + " " + cmd);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String out;
            List<String> times = new ArrayList<>(count);

            while((out = br.readLine()) != null) {
                String[] outarray = out.split(" ");
                System.out.println(out);
                if(outarray.length == 9) {
                    times.add(outarray[7].substring(5));
                }
            }

            MedianTime(times, count);
        } catch (Exception e) {
            System.err.println("Sorry, unable to reach the address " + cmd);
        }
    }

    /**
     * @param times Array List of timings obtained from each ping output.
     * @param count Number of times pinged.
     */
    static void MedianTime(List<String> times, int count) {
        Collections.sort(times);
        System.out.println(times);
        System.out.println();
        Float Median;
        if((count % 2) == 0) {
            Median = Float.valueOf(times.get((count/2) - 1)) + Float.valueOf(times.get(count/2));
            Median = Median/2;
        } else {
            Median = Float.valueOf(times.get(times.size() / 2));
        }
        System.out.println("Median time for " + count + " pings is " + Median + "ms.");
    }

    public static void main(String[] args) throws UnknownHostException {
        String ip; //= "www.google.com";
        System.out.println("Enter a web address to ping ");
        Scanner scan = new Scanner(System.in);
        ip = scan.nextLine();
        System.out.println("The number of times you want to ping ");
        int count = scan.nextInt();
        command(ip, count);
        scan.close();

    }

}


