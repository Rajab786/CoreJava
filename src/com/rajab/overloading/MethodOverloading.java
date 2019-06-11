package com.rajab.overloading;

public class MethodOverloading  {

    public static void main(String[] args)

    {
        System.out.println("Hello World!");
        System.out.println(process("shujaat"));
        System.out.println(process("shujaat", "Ali"));

    }




    // method Overloading


    public static  String  process(String str){


      String result =   str.toUpperCase();

      return result ;

    }


    public static String  process(String s1 , String s2){

        String concat =  s1.concat(s2);
        return concat ;
    }
}
