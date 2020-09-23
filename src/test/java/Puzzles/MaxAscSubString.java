package Puzzles;

public class MaxAscSubString {

    int calculateMaxAscSubstring(String str){

        char[] cArr=str.toCharArray();

        int maxlength=0;
        int tempmax=0;
        int j=0;

        for(int i=0;i<cArr.length-1;i=j+1){

            tempmax=0;

            for( j=i;j<cArr.length-1;j++)
            {
                if(cArr[j+1]>=cArr[j])
                {
                    ++tempmax;
                }
                else break;

            }
            if(tempmax>maxlength)maxlength=tempmax;


        }

        return maxlength;


    }


    public static void main(String[] args) {


        System.out.println(new MaxAscSubString().calculateMaxAscSubstring("52346668367889123"));

    }
}
