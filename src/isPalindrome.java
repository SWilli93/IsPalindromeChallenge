public class isPalindrome {
    public static void main(String[] args) {
        int number = 808;
        isPalindrome(number);
    }



    public static int reversedNum(int num) {

        int reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
        return reversed;

    }

    public static boolean isPalindrome(int num) {
        System.out.println(num);
        System.out.println(reversedNum(num));
        if (reversedNum(num) == num) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
