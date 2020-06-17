//package HackerRank;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class ValleysCount {
//
//
//    static String timeConversion(String s) {
//
//        StringBuffer str=new StringBuffer(s);
//
//
//        if (s.substring(0,2).equals("12"))
//        {
//            if(s.charAt(s.length()-3)=='A')
//            {
//                str.replace(0,2,"00");
//            }
//
//        }
//
//
//        if ((Integer.parseInt(s.substring(0,2)))<12&&(Integer.parseInt(s.substring(0,2)))>0)
//
//        {
//            if(s.charAt(s.length()-3)=='P')
//            {
//
//                int newTime=Integer.parseInt(s.substring(0,2))+12;
//
//
//                str.replace(0,2,String.valueOf(newTime));
//            }
//
//
//
//        }
//
//        return str.delete(0,str.setLength()-1);
//
//
//
//
//    }
//
//
//    public static void main(String[] args) throws IOException {
//
//int ar[]=new int[]{18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
//
//      //  int result = birthdayCakeCandles(ar);
//        System.out.println(result);
//    }
//}
