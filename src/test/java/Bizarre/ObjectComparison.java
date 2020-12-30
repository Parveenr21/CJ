package Bizarre;

import com.google.inject.internal.util.$ImmutableSet;

public class ObjectComparison {



    public static void main(String[] args) {

        ObjectComparisonClass o1=new ObjectComparisonClass();

        ObjectComparisonClass o2=new ObjectComparisonClass();

        System.out.println(o1==o2);
        System.out.println(o1.equals(o2));

        String s1= new String ("yahoo");
        String s2= new String ("yahoo");

        if(s1==s2)
        {
            System.out.println("String  == ");

        }
        else
        {
            System.out.println("String  != ");
        }

        if(s1.equals(s2))  //equals is overriden in String class from equals method of Object class.
            ///while equals in Objectclass checks for actual real same object comparison.
            //String class equals checks for content char by char and same object
        {
            System.out.println("String  Equal");
        }
        else
        {
            System.out.println("String Not Equal");
        }

        System.out.println(o1);
        System.out.println(o2);

        System.out.println(new ObjectComparisonClass());
        System.out.println(new ObjectComparisonClass());

    }
}
