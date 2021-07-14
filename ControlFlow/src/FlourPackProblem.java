public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }
    public static boolean canPack(int largeQty,int smallQty, int goalQty) {
        if(largeQty < 0 || smallQty < 0 || goalQty < 0) {
            return false;
        }
        if(goalQty > ((largeQty * 5) + smallQty)) {
            return false;
        }
        if((goalQty % 5) > smallQty) {
            return false;
        }
        return true;
    }
}
