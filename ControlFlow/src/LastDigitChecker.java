public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(33,26,44));
    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
//        boolean valid = (
//                (x > 9 && x <= 1000) &&
//                (y > 9 && y <= 1000) &&
//                (z > 9 && z <= 1000)
//                ) ? true : false;

//        int x1, y1, z1;
        if(isValid(x) && isValid(y) && isValid(z)) {
            x %= 10;
            y %= 10;
            z %= 10;

            if(x == y || x == z || y == z) {
                return true;
            } else {
                return false;

            }
        } else  {
            return false;
        }
    }
    public static boolean isValid(int x) {
        boolean valid = (x > 9 && x <= 1000) ? true : false;
        if(valid)
            return true;
        return false;
    }
}
