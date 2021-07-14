public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,52));
    }
    public static boolean hasSharedDigit(int x, int y ) {
        boolean valid = (x > 9 && x < 100 ) && (y > 9 && y < 100 ) ? true : false;
        int x1, x2, y1,y2;

        if(valid) {
            x1 = x % 10;
            y1 = y % 10;
            x /= 10;
            y /= 10;
            if(x1 == y1 || x1 == y || x == y1 || x == y) {
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }
}
