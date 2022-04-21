public class SumOfNoInString {
    static int findSum(String str) {
        // A temporary string
        StringBuilder temp = new StringBuilder("0");

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch)) {
                temp.append(ch);
            }
            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp.toString());
                System.out.println(sum);

                // reset temporary string to empty
                temp = new StringBuilder("0");
            }
        }

        // takes care of trailing numbers - ex: 68
        return sum + Integer.parseInt(temp.toString());
    }

    // Driver code
    public static void main(String[] args) {

        // input alphanumeric string
        String str = "12abc20yz68";

        // Function call
        System.out.println(findSum(str));
    }
}
