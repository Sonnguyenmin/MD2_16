package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b7 {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter min");
        Scanner sc = new Scanner(System.in);
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Enter max");
        int max = Integer.parseInt(sc.nextLine());

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (min <= arr[i] && arr[i] <= max){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("There are " + count + " elements");
    }
}
