package xyz.test.obj;

public class ArraySort {
    public static void getAnswer(){
        int[] a = {70,80,31,37,10,1,48,60,33,80};
        int[] b = bubbleSort(a);
        for (int i:b)
            System.out.print(i+" ");
    }

    private static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean Flag = false;// if change
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    Flag = true;
                }
            }
            if (!Flag)
            {
                break;
            }
        }
        return array;
    }
}
