package String;

public class ReverseOrderWordsinAString {



    static void foo(String s1)
    {

        String reverse="";
        String[] sArr=s1.split(" ");

        for(int i=sArr.length-1;i>=0;i--)
        {

            reverse=reverse+sArr[i]+" ";
        }


        System.out.println(reverse);
    }

    public static void main(String[] args) {
        foo("abc def ghi");
    }


}



