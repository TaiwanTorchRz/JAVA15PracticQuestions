package xyz.test.Basic;

public class HCF {
    public static void getAnswer(int a,int b) {
        int c = 0;
        while (a != 0 && b != 0) {
            if (a > b) { //a=1000 b=495 c=505
                c = a - b;
                a = c;
            }else{
                c = b - a;
                b = c ;
            }
        }
        if (a == 0)
            System.out.println("HCF=" + b);
        else
            System.out.println("HCF=" + a);
    }
}
