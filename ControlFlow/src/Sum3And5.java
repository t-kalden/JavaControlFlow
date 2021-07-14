public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++ ) {
            boolean valid = (i % 3 == 0) && (i % 5 == 0)? true : false;
            boolean cancle = (count == 5 ) ? true : false;
            if(valid) {
                count++;
                sum += i;

                System.out.println ("Found @ " + i );
            }
            if (cancle) {
                System.out.println("Break @ " + i);
                break;
            }
        }
        System.out.println(sum);

    }

}
