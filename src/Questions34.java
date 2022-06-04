public class Questions34 {

    /*
    34  USE double
    Dont use sort get max  4.5
    String[] arr = {"1","2.5", "3", "3.5", "4.5"};

    output
    4.5
     */
    public static void main(String[] args) {

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        System.out.println(maxNumInArray(arr));
    }

    public static double maxNumInArray(String [] arr) {

        double [] newArr = new double[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=Double.parseDouble(arr[i]);
        }

        double maxNum = newArr[0];

        for (int i = 0; i < newArr.length; i++) {
            if (maxNum < newArr[i]) {
                maxNum = newArr[i];
            }
        }
        return maxNum;
    }
}
