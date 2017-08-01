import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CopyCharacter {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
        BufferedReader br = null;
        String str;
        FileWriter out = null;
        try {
            br = new BufferedReader(new FileReader(args[0]));
            Set<Character> cSet = new TreeSet<>();  /* Making a Set of unique Characters in file */
            List<Character> cList = new ArrayList<>(); /* List of all Characters in file */
            Map<Character, Integer> cMap = new HashMap<>();
            while ((str = br.readLine()) != null) {
                char[] cArray = (str).toCharArray(); // Making an array of all characters.
                for (char c : cArray) cSet.add(c);
                for (char c : cArray) cList.add(c);
                for (Character c : cSet) {
                    int count = 0;
                    for (Character d : cList) {
                        if (d.equals(c)) count++;
                    }
                    cMap.put(c, count);

                }
            }
            System.out.println();
            System.out.println(String.valueOf(cMap)); /* Printing the output*/
            out = new FileWriter("output.txt"); /* Writing the output to a text file. */
            out.write(String.valueOf(cMap));

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                br.close();
            }
            if (out != null) {
                out.close();
            }
        }


    }
}
