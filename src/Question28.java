public class Question28 {

//    //28  Find unique
//    String str = "accabbcd";
//    Map<Character, Integer> unique = new HashMap<>();
//
//    output
//
//    {d=1}

    public static void main(String[] args) {
        String str2 = "accabbcd";
        System.out.println(unique(str2));
    }

    public static String unique(String str) {
        String UniqueCharacter = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                UniqueCharacter += str.charAt(i) + "=1";
            }

        }
        return UniqueCharacter;

    }
}

