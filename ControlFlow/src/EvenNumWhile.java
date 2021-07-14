public class EvenNumWhile {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        int even = 0;

        while (start <= end) {
            if(isEvenNumber(start)){
                System.out.println(start + " is even");
                even++;
                start++;
                if(even == 5 ) {
                    System.out.println("even numbers found: " + even);break;}
            } else {
                start++;
            }

        }

    }
    public static boolean isEvenNumber(int x) {
        boolean isEven = (x % 2 == 0) ? true : false;
        if(isEven) {
            return true;
        }
        return false;
    }
}
