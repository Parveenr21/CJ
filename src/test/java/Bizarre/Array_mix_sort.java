package Bizarre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array_mix_sort {

    void foo(int arr[])
    {

        int b[]=new int[arr.length];
        List<Integer> listA = new ArrayList<>();

        for(int i:arr)
        {
            listA.add(i);

        }
        Collections.sort(listA);

        int j=0;
        for(int i=0;i<listA.size()/2;i++)
        {
            b[j]=listA.get(listA.size()-i-1);
            b[j+1]=listA.get(i);
            j=j+2;

        }

        for(int i:b)
        {

            System.out.println(i);
        }





    }


    public static void main(String[] args) {
        new Array_mix_sort().foo(new int[]{2,5,6,8,11,2,8,9});
    }
}
