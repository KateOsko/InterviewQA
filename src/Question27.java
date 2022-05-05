import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question27 {

    //    //27 frequency
//    String str="AABBDDDC";
//    Map<Character, Integer> map = new LinkedHashMap<>();
//    output
//    {A=2, B=2, D=3, C=1}

    public static void main(String[] args) {
        String str3 = "AABBDDDC";
        System.out.println(str(str3));
        System.out.println(frequency(str3));
    }

    public static String str(String str1) {

        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            char letter = str1.charAt(i);
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                char eachLetter = str1.charAt(j);
                if (letter == eachLetter) {
                    count++;
                }
            }
            str2 += letter + "=" + count + " ";

        }

        return str2;
    }

    public static String frequency(String str) {

        String result = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (result.contains(each)) {
                continue;
            }
            result += each + "="+ frequency +" ";
        }
        return result;
    }
}




