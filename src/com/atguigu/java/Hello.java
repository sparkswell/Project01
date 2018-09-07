package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("helloWorld");

        List list = new ArrayList();

        new Date();

        list.add(0,"er");




        System.out.println("hello");
        //soutp  soutm   soutv    xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("Hello.main");
        int num = 10 ;
        System.out.println("num = " + num);
        System.out.println("num = " + num);
        int num2 = 2;
        int num3 = 5;
        System.out.println("num3 = " + num3);
        System.out.println(num);

        //fori
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //iter
        for (Object o : list) {

        }
        //itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
        //
        List list1 = new ArrayList();
        list1.add(12);
        list1.add(23);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }



    }

    public void hello(){


        List list = new ArrayList();
        list.add(12);
        list.add(23);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {
            System.out.println();
        }
    }

}
