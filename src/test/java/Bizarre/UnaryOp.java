package Bizarre;

public class UnaryOp {


   static void  foo(String s)
    {

        //Integer i=Integer.parseInt(s);
        Integer j=Integer.parseInt(s,21);
        System.out.println(j);
        System.out.println(j|01110);

        Integer.bitCount(21);

    }
    public static void main(String[] args) {
        foo("100001");
    }
}
