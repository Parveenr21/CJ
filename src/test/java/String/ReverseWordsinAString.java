package String;

public class ReverseWordsinAString {

    static void foo(String s1)
    {

        String reverseStr="";
    String sArray[]=s1.split(" ");

    for(String si: sArray)
    {

        reverseStr=reverseStr+reverseString(si)+" ";

    }

        System.out.println(reverseStr);

    }

    static String reverseString(String s1)
    {

        char [] cArr=s1.toCharArray();

        for(int i=0;i<cArr.length/2;i++)
        {

            cArr[i]= (char) (cArr[i]+cArr[cArr.length-i-1]);
            cArr[cArr.length-i-1]= (char) (cArr[i]-cArr[cArr.length-i-1]);
            cArr[i]= (char) (cArr[i]-cArr[cArr.length-i-1]);


        }

        String s_new=new String(cArr);

        return s_new;
    }

    public static void main(String[] args) {
        foo("abc def ghi");
    }
}
