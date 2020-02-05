package com.sun.testprojectforjob.tools;

public class test2 {
    static Test test=new Test();
    public static String tt=test.getString();
    public static void main(String args[]){
        System.out.println(tt);
    }

}
 class  Test{
    public String getString(){
        return "hello world";
    }
}


