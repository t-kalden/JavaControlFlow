public class digitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }
    private static int sumDigits(int num) {
        boolean validate = (num > 10 ) ? true : false;
        if(!validate) {
            return -1;
        }
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
//            System.out.println("num " +num);
        }
        return sum;
    }
}
