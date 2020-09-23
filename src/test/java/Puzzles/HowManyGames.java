package Puzzles;

public class HowManyGames {


    int calculate(int p, int d , int m, int s)
    {

        int noOfGames=0;
        if(s<p)return 0;
        int counter=0;
        while(p-(counter*d)>m&&s-m>=0)
        {

            s=s-p+(counter*d);
            counter++;
            noOfGames++;

        }

        noOfGames=noOfGames+s/m;

return noOfGames;



    }

    public static void main(String[] args) {

        System.out.println(new HowManyGames().calculate(100,19,1,180));

    }
}
