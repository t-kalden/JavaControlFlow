public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }
    public static boolean isPerfectNumber(int x) {
        boolean invalid = (x < 1) ? true : false;
        int check = 0;
        int sum = 0;

        if(invalid) {
            System.out.println("Invalid Input");
            return false;
        } else {
            for(int i = 1; i < x; i++) {
                if(x % i == 0) {
                    sum += i;
                }
            }
            if(sum == x) {
                System.out.println("Perfect number");
                return true;
            } {
                System.out.println("Not a perfect number");
                return false;
            }
        }
    }
}
