package Bizarre;

public class Anagram {

    boolean foo(String s1,String s2)
    {

        int z1[]=new int[26];
        int z2[]=new int[26];

        if(s1.length()!=s2.length())return false;

        for(int i=0;i<s1.length();i++)
        {
        ++z1[s1.charAt(i)-'a']; //for 26chars
        ++z2[s2.charAt(i)-'a'];;

        }

        for(int i=0;i<s1.length();i++)
        {
            if(z1[i]!=z2[i])return false;
        }
        return true;





    }

    public static void main(String[] args) {

        System.out.println(new Anagram().foo("dssddd","dsddds"));
    }
}
