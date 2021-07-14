public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int num) {
        boolean valid = (num > 1) ? true : false;
        int prime = 0;
        if(valid) {
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    num /= i;
                    prime = i;
                    if(i % 2 == 0) {
                        prime = 2;
                    }
                }
                else {
                   prime = i +1;
                }
            }
            return prime;
        }
        return -1;
    }
}
