import java.util.Scanner;

public class Question_19 {
    /*19
* Write a return method that can verify if a password is valid or not.
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = input.nextLine();
//        String password= "hardCoded1!";
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValid(String password) {

        boolean validPass = false;

        if (password.length() <= 6 ) {
            return false;
        }
        if(password.contains(" ")){
            return false;
        }

        int sumDigits = 0;
        int sumUpperCase = 0;
        int sumLowerCase = 0;
        int sumSpecialChars = 0;
        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) {
                sumDigits++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                sumUpperCase++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                sumLowerCase++;
            } else {
                sumSpecialChars++;
            }

        }
        if (sumDigits >= 1 && sumUpperCase >= 1 && sumLowerCase >= 1 && sumSpecialChars >= 1) {
            return true;
        }

        return validPass;
    }
}






