package xyz.test.Basic;

import jdk.jfr.Timestamp;

import java.util.Date;

public class Armstrong {
    public static void getAnswer(int from, int to) {
        for (int index = from; index < to; index++) {
            {/*
                int count = String.valueOf(index).length();
                for (int i = 0; i < count; i++) {

                }*/

                if (Math.pow(((int) (index / 100)) % 10, 3) +
                        Math.pow(((int) (index / 10)) % 10, 3) +
                        Math.pow(index % 10, 3) == index)
                    System.out.printf("%s^3 + %s^3 + %s^3 = %d\n",
                            String.valueOf(index).charAt(0),
                            String.valueOf(index).charAt(1),
                            String.valueOf(index).charAt(2),
                            index);

                /*if (Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(0))), 3) +
                        Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(1))), 3) +
                        Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(2))), 3) == index)
                    System.out.printf("%s^3 + %s^3 + %s^3 = %d\n",
                            String.valueOf(index).charAt(0),
                            String.valueOf(index).charAt(1),
                            String.valueOf(index).charAt(2),
                            index);*/
            }
        }
    }
}
