public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int x, int y) {
        boolean invalid = (x < 10 || y < 10) ? true : false;
        int gcd = 0;
        int check = 0;

        if(invalid) {
            return -1;
        } else {
            for(int i = 1; i <= x && i <= y; i++) {
                if(x % i == 0 && y % i ==0) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }
}
