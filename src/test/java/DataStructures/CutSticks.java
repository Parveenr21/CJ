package DataStructures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CutSticks {


    static List<Integer> list=new ArrayList<Integer>(10);


    static int[] cutTheSticks(int[] arr) {
        int counter = -1;
        int z[] = new int[arr.length];


        z=updateArr(arr,findmin(arr));

        while (isValid(z))
        {
            z=updateArr(z,findmin(z));

        }

        return z;

    }


    static int findmin(int arr[]) {


        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]> min && min==0) {
                min = arr[i];
            }

            else if (arr[i] < min && arr[i]>0 ) {
                min = arr[i];

            }

        }
        return min;
    }



     static int[] updateArr(int arr[], int min) {
        int counter = 0;
        int z[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - min >= 0) {
                ++counter;
            }

            z[i] = (arr[i] - min >= 0) ? arr[i] - min : 0;

        }
         list.add(counter);
        return z;

    }


    static boolean isValid(int arr[])
    {
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
            ++counter;
            }


        }
        if(counter>=1)return true;
        else return false;


    }

    public static void main(String[] args) throws IOException {

        cutTheSticks(new int[]{5,4,4,2,2,8});


    }

}