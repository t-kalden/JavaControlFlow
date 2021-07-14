public class Factors {
    public static void main(String[] args) {
        printFactors(32);
    }
    public static void printFactors(int num) {
        boolean invalid = (num < 1) ? true : false;

        if(invalid) {
            System.out.println("Invalid Value");
        }
        int check = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                check = i;
                System.out.println(check);
            }
        }
    }
}
