public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
    }
    public static boolean isPalindrome(int num) {
        if(num < 0) {
            num *= -1;
        }
        int check = num;
        int palindrome = 0;
        while(check > 0) {
            palindrome *= 10;
            int digit = check % 10;
            palindrome += digit;
            check /= 10;
            System.out.println(palindrome);
        }
        if (palindrome == num) {
            return true;
        }
        return false;
    }
}
