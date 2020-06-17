package String;

public class ReverseAString {

    static void foo(String s)
    {

        /*

        String s1="xyz";
        Char[] cArr=s1.toCharArray();

        String s1=new String(cArr);


         */


        char [] cArr=s.toCharArray();

        for(int i=0;i<cArr.length/2;i++)
        {

            cArr[i]= (char) (cArr[i]+cArr[cArr.length-i-1]);
            cArr[cArr.length-i-1]= (char) (cArr[i]-cArr[cArr.length-i-1]);
            cArr[i]= (char) (cArr[i]-cArr[cArr.length-i-1]);


        }

        String s_new=new String(cArr);  //Simplest to convert to and from String-CharArray
        System.out.println(s_new);



    }
    public static void main(String[] args) {
        foo("abcdefghijk");
    }
}


