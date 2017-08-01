import java.io.*;
import java.util.*;

/**
 *
 *
 * Created by zemosozemoso on 14/7/17.
 */
public class CharacterCount {
    Map<Character, Integer> counting(File inputfile) throws IOException {
        BufferedReader br = null;
        Set<Character> cSet = new TreeSet<>();
        List<Character> cList = new ArrayList<>();
        Map<Character, Integer> cMap = new HashMap<>();

        try {
            br = new BufferedReader(new FileReader(inputfile));
            String str;

            /*
            1. Each line is converted into an array of strings.
            2. unique set of characters are collected from each line.
            3. Each unique character is used to count number of occurrences
            4. Each unique character and its count is stored in map.
             */
            while ((str = br.readLine()) != null) {
                char[] cArray = (str).toCharArray(); // Making an array of all characters.
                for (char c : cArray){
                    cSet.add(c);
                }
                for (char c : cArray){
                    cList.add(c);
                }
                for (Character c : cSet) {
                    int count = 0;
                    for (Character d : cList) {
                        if (d.equals(c)) count++;
                    }
                    cMap.put(c, count);
                }
            }
        } finally {
            if(br != null) {
                br.close();
            }

        }
        return cMap;
    }
}
