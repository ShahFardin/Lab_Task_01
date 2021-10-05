package com.ShahFardin;

public class Main {

    String section = "C";

    public static void main(String[] args) {

      Info info = new Info();
        System.out.println("My name is: "+info.name);
        System.out.println("My ID: "+info.id);

        Main sec = new Main();
        System.out.println("Section: "+sec.section);

        Hobby hobby = new Hobby();
        System.out.println("My hobby is: "+hobby.hobbyName);


        /* ID=2012020126
     Name= Fardin Shah
     Section= C
     Email = cse_2012020126@lus.ac.bd
     Date = 15/7/2021
   */

    }
}
