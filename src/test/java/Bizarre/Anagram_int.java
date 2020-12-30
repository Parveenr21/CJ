package Bizarre;

public class Anagram_int {

    boolean foo(String s1,String s2)
    {

        if(s1.length()!=s2.length())return false;

        int z1[]=new int[10];
        int z2[]=new int[10];

        for(int i=0;i<s1.length();i++)
        {
            ++z1[s1.charAt(i)-'0']; //for 10 chars ..0 to 9
            ++z2[s2.charAt(i)-'0'];;

        }

        for(int i=0;i<s1.length();i++)
        {
            if(z1[i]!=z2[i])return false;
        }
        return true;





    }

    public static void main(String[] args) {

        System.out.println(new Anagram_int().foo("1212121","1121212"));
    }
}
