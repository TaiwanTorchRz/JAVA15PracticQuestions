package xyz.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	Scanner scn = new Scanner(System.in); int in = scn.nextInt();
        for (int index = 100; index < 1000; index++) {
            {
//                System.out.println(index);
//                System.out.println(String.valueOf(index).charAt(0));
//                System.out.println(Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(0))),3));
//                System.out.println(String.valueOf(index).charAt(2));
                if (Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(0))),3) + Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(1))),3) + Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(2))),3) == index){
                    System.out.printf("%s^3 + %s^3 + %s^3 = %d\n",String.valueOf(index).charAt(0),String.valueOf(index).charAt(1),String.valueOf(index).charAt(2),index);
;                }
            }
        }
    }
}
