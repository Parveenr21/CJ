package Bizarre;

import CollectionFramework.ArrayList_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Between2Sets {








    List<Integer>  getSortedIntlist_from_intArray(int arr[],boolean isreverse)
    {

        List<Integer> list=new ArrayList<>();

        for(int arr_element:arr)
        {
            list.add(arr_element);
        }

        if(!isreverse)  Collections.sort(list);
        else
        {
            Collections.sort(list);
            Collections.reverse(list);
        }

        return list;
    }




    public static void main(String[] args) {
       // new Between2Sets().foo(new int[]{2,4},new int[]{16,32,96});
    }
}
