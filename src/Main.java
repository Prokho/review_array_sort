import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] arr1 = new int [10];
        Random rnd = new Random();

        for(int i =0; i< arr1.length; i++){

            arr1 [i] = rnd.nextInt(100);

        }
        print(arr1);
        boolean result = check(arr1);
        System.out.println(result);
        if(result==false){
            Arrays.sort(arr1);
            print(arr1);
        }
        int[] arr2 = new int [10];
        for(int i=0; i< arr2.length; i++){

            arr2 [i] = 1 + i;
        }
        print(arr2);
        result = check(arr2);
        System.out.println(result);

    }

    public static void print(int[] arr){

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean check(int[] arr){
        for (int i = 0; i < arr.length-1; i++){

            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }




}
