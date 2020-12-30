package Puzzles;

public class BinaryStringtoBinaryNumber {

     void foo(String s)
    {
        //These binary opeartion will be on int only not on String

       // String s1=s << 1;

        int z=Integer.parseInt(s,2);
        System.out.println(z);

        String kk=Integer.toBinaryString(Integer.parseInt(s,2));
        System.out.println(Integer.toBinaryString(Integer.parseInt(s,2)));


    }


    public static void main(String[] args) {
        String str="110011";
        new BinaryStringtoBinaryNumber().foo(str);
    }
}
