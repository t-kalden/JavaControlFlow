public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(10,5));
    }
    public static boolean isOdd(int num) {
        boolean pos = (num > 0 ) ? true : false;
        if(pos) {
            boolean even = (num % 2 == 0) ? true : false;
            if(!even) {
                return true;
            }
            return false;
        }
        return false;
    }
    public static int sumOdd(int x, int y) {
        int sum = 0;
        boolean valid = (x <= y && x > 0 && y > 0) ?true: false;
        if(valid ) {
            for(int i = x; i <= y; i++) {
                boolean odd = isOdd(i);
                if(odd) {
                    sum += i;
                }
            }
        } else {
            sum = -1;
        }

        return sum;
    }
}
