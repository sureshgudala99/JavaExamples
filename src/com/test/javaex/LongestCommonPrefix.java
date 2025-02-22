package com.test.javaex;

import java.util.Arrays;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] strs)

    {
        if(strs==null || strs.length==0)
            return "-1";
        Arrays.sort(strs);

        String first =strs[0];
        String last =strs[strs.length-1];
        int minlength =Math.min(first.length(),last.length());

        int i=0;

        while(i<minlength && first.charAt(i)==last.charAt(i))

        {
            i++;
        }
        if (i==0)
            return "-1";

return first.substring(0,i);
    }

    public static void main(String[] args) {

        String[] str = {"geekforGeeks","geeks","geek","geezer"};

      String lpstr=  longestCommonPrefix(str);
        System.out.println(lpstr);

    }

}
