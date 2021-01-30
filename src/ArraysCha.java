import java.util.Arrays;
import java.util.Scanner;

public class ArraysCha {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int myIntegers[] = getIntegers(5);//{106,26,81,5,15};
        int[] sorted=sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter " + capacity + " integer value \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + "contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray= Arrays.copyOf(array,array.length);

        boolean flag = false;
        int temp;
        while (flag){
            flag = true;
        for (int i = 0; i < sortedArray.length-1; i++) {
            if (sortedArray[i] < sortedArray[i+1]) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag=true;
            }
        }
        }
        return sortedArray;
    }
}

