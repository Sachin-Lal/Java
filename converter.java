public class converter {
    public static void main(String[] args) {
        int a=10;
        double b=a;
        System.out.println("Implicit Type Cpnversion");
        System.out.println("a="+a);
        System.out.println("b="+b);
        b=34.987;
        
        System.out.println("Explicit Type Cpnversion");
        a=(int)b;
        System.out.println("a="+a);
        System.out.println("b="+b);

    // byte->short->int->long->float->double 
    // left to right (->) Implicit Conversion
    // right to left (<-) Explicit Conversion
        
    }
}
