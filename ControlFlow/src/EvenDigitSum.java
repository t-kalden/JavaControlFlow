public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-1));
    }
    public static int getEvenDigitSum(int num) {
        boolean validate = (num >= 0) ? true : false;
        int check, sum;
        check = num; sum = 0;
        if(validate) {
            while (check > 0) {
                if((check % 10) % 2 == 0) {
                    sum += (check % 10);
                }
                check /= 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
