package com.stackroute.pe1;

public class StringTrimming {
    public String substringConcat(String str,int number)
    {
        if(str==null)
        {
            return "string must be non null";
        }
        if(str.length()<number)
        {
            return "string must be larger than the number";
        }


        String result="";

        int lengthOfString=str.length();
        String substring=str.substring(lengthOfString-number,lengthOfString);

        for(int i=0;i<number;i++)
        {
            result=result+substring;
        }

        return str.concat(result);

    }
}

