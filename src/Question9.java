public class Question9 {
/*
Q9
String str="DC501GCCCA098911";

output
CD015ACCCG011899

 */
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        String roger="";

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (Character.isUpperCase(symbol)){
                if(Character.isDigit(symbol+1)){

                }
                roger+=symbol;
            }else if(Character.isDigit(symbol)){
                if(Character.isUpperCase(symbol+1)){

                }
                roger+=symbol;
            }

            System.out.println(roger);
        }





    }

}
