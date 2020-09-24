package xyz.test.Basic;

public class Armstrong {
    public static void cal(int from ,int to){
        for (int index = from; index < to; index++) {
            {
                if (Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(0))),3) + Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(1))),3) + Math.pow(Integer.parseInt(String.valueOf(String.valueOf(index).charAt(2))),3) == index)
                    System.out.printf("%s^3 + %s^3 + %s^3 = %d\n",String.valueOf(index).charAt(0),String.valueOf(index).charAt(1),String.valueOf(index).charAt(2),index);
            }
        }
    }
}
