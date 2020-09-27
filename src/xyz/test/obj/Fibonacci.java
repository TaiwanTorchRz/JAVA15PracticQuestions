package xyz.test.obj;

public class Fibonacci {
    public static void getAnswer(int number){
        int[] a = new int[number];
        a[0] = 0; a[1] = 1;
        for (int i = 2; i < a.length; i++){
            a[i] = a[i - 1] + a[i-2];
        }
        for (int i:a) {
            System.out.print(i+" ");
        }System.out.println();
    }
}
