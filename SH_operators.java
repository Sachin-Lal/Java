public class SH_operators {
    public static void main(String[] args) {
        int s=5;
        //System.out.println("s="+ s++);
        //System.out.println("s="+ s);
        int k = 49;
        s = ++k + k-- + --k - ++k + k--;
        System.out.println("k="+ k);
        System.out.println("s="+ s);
    }
}
