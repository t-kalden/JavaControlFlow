public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(25);

    }

    public static void printSquareStar(int num) {
        boolean valid = (num >= 5) ? true : false;
        if(valid) {
            String star = "*  ";
            String spacer = "   ";
            for(int i = 1; i <= num; i++){
                for(int j = 1; j <= num; j++) {
                    if(i == 1 || j == 1 || i == num || j == num) {
                        System.out.print(star);
                    } else if(i == j) {
                        System.out.print(star);
                    } else if(j == ((num - i) + 1)){
                        System.out.print(star);
                    } else {
                        System.out.print(spacer);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
