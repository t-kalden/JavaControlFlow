public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(10010));
        numberToWords(900);
    }

   public static void numberToWords(int num) {
       boolean invalid = (num < 0) ? true : false;
       if(invalid) {
           System.out.println("Invalid Value");
       } else {
           String numToWords = "";
           int reversedNum = reverse(num); // calls reverse() method to reverse input
           int reversedNum2 = reversedNum;

//           int count = getDigitCount(num); // calls getDigitCount() method to get number of digits in input
           do {
               int rem = reversedNum % 10;
               reversedNum /= 10;
               switch (rem) {
                   case 0:
                       numToWords = numToWords + "Zero ";
                       break;
                   case 1:
                       numToWords = numToWords + "One ";
                       break;
                   case 2:
                       numToWords = numToWords + "Two ";
                       break;
                   case 3:
                       numToWords = numToWords + "Three ";
                       break;
                   case 4:
                       numToWords = numToWords + "Four ";
                       break;
                   case 5:
                       numToWords = numToWords + "Five ";
                       break;
                   case 6:
                       numToWords = numToWords + "Six ";
                       break;
                   case 7:
                       numToWords = numToWords + "Seven ";
                       break;
                   case 8:
                       numToWords = numToWords + "Eight ";
                       break;
                   case 9:
                       numToWords = numToWords + "Nine ";
                       break;
                   default:
                       System.out.println("Invalid Value");
                       break;
               }
           } while (reversedNum > 0);
           if(getDigitCount(reversedNum2) < getDigitCount(num)) {
               int check = getDigitCount(num) - getDigitCount(reversedNum2);
               for(int i = 0; i < check; i++) {
                   numToWords = numToWords + "Zero ";
               }
           }
           System.out.println(numToWords);
       }
   }
   public static int reverse(int num) {
        int reversed = 0;
        while (num != 0 ) {
            reversed *= 10;
            reversed += num % 10;
            num /= 10;
        }
        return reversed;
   }
   public static int getDigitCount(int num) {
       boolean valid = (num >= 0) ? true : false;
       int count = 0;
       if(valid) {
           do{
               count++;
               num /= 10;
           } while (num > 0);
           return count;
       } else {
           return -1;
       }
   }
}
