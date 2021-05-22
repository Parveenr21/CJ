package Inheritance;

import CollectionFramework.ArrayList_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Spread {

    static int foo(List<Integer> px){

        Stack<Integer> stk=new Stack<Integer>();

        int counter=0;
        for(int px_val:px)
        {


            while (!stk.isEmpty()&&stk.peek()>px_val)
            {
                stk.pop();
                --counter;
            }
            stk.push(px_val);
            ++counter;


        }


return counter;

    }


    public static void main(String[] args) {

        ArrayList<Integer> arList=new ArrayList<>();
        arList.add(7);
        arList.add(1);
        arList.add(2);
        arList.add(5);



        System.out.println(foo(arList));
    }

}



