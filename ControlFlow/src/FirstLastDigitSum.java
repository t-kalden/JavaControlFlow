public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1));

    }
    public static int sumFirstAndLastDigit(int num) {
        int check, sum;
        check = num; sum = 0;
        boolean validate = (num >= 0) ? true : false;

        if(validate) {
            sum += check % 10;
            while (check > 0) {
                if(check / 10 == 0 ) {
                    sum += check % 10;
                }
                check /= 10;
            }
            return sum;
        } else  {
            return -1;
        }
    }
}
