package com.sun.testprojectforjob.tools;

import java.math.BigInteger;

public class testIdcarad {
    public static void main(String args[]){
        //BigInteger id=new BigInteger("10000000000000000");
        //取余数   divide商   multiply乘     add   subtract减
        //BigInteger tt=id.remainder(new BigInteger("3"));
        //System.out.println(id+"==="+tt);
        int count=0;
        for (int j=0;j<1000000;j++){
            if (isPrine(j)){
                //System.out.println(j);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrine(int x){
        int sq= (int) Math.sqrt(x);
        for(int i=3;i<x;i+=2){
            if (x%i==0)
                return false;
        }
        return true;
    }
}
