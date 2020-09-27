package xyz.test.obj;

public class Card {
    static char[] name = {'梅','桃','心','磚'};
    static String[] exist = new String[52];
    static int existCount = 0;
    static String output = "";
    public static void getAnswer(){
        boolean existed = false;
        do{
            int random = (int)(Math.random()*52+1);
            String temp = String.valueOf(name[(int)(Math.random()*4)])+random;
//            System.out.print(">"+temp+" ");
            if (existCount == 0){
                exist[0] = temp+random;
                existCount++;
            }else{
                for (String index:exist){
                    if (index!=null){
                        System.out.println("temp: "+temp+" index: "+index);
                        if (index==temp){
                            System.out.println("偵測重複>>temp: "+temp+" index: "+index);
                            existed = true;
                            break;
                        }
                    }

                }
                if (!existed){
                    output += temp+" ";
                    exist[existCount] = temp;
                    existCount++;
                }
            }
            existed = false;
        }while(existCount != 52);
        System.out.println("------------------");
        System.out.println(output);
    }
}
