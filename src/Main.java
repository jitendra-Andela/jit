import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
/*        int[] myVariable =new int[25]; // {1,2,3,4,5,6,7,8,9,10};
//        myVariable[5] = 50;
//        myVariable[0] = 30;
//        myVariable[4] = 80;
        double[] myDoubleArray = new double[10];
        System.out.println(myDoubleArray[5]);
        System.out.println(myVariable[5]);
        System.out.println(myVariable[0]);
        System.out.println(myVariable[4]);

        for(int i=0;i<myVariable.length;i++){
//            myVariable[i]=i+10;
            myVariable[i]=i*10;
        }
        printArray(myVariable);
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element = " + i + ", value is " +array[i]);
        }
    }
 */
        int[] myIntegers = getIntegers(5);
        for(int i=0;i<myIntegers.length;i++){
            System.out.println("element " + i + ", typed value was " + myIntegers[i] );
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("enter " + number + " integers values. \r");
        int[] values=new int[number];

        for (int i=0;i< values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static  double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/(double)array.length;
    }
    }

