package Bizarre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortPositive {


    static List<Integer> list=new ArrayList<>();

    static void foo(int []x) {

        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {

                list.add(x[i]);
            }
        }

        Collections.sort(list);
        int arr[] = new int[x.length];
        int k = 0;
        for (int i = 0; i < x.length; i++) {

            if (x[i] > 0) {
                arr[i] = list.get(k);
                ++k;
            } else {

                arr[i] = x[i];
            }

        }


        for (int i = 0; i < x.length; i++) {

            System.out.println(arr[i]);
        }
    }





    public static void main(String[] args) {
        foo(new int[]{5,3,-1,2,-8,9});
    }

}




