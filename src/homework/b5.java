package homework;

import java.util.Arrays;
import java.util.Scanner;

public class b5 {
//    private static Integer[] getArr() {
//        Integer arr[] = new Integer[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
//        return arr;
//        /** Copyright belong to Rekkei Academy*/
//    }
//
//    public static void main(String[] args) {
//        Integer[] arr = getArr();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//        System.out.println();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnter min number");
//        int min = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter max number");
//        int max = Integer.parseInt(sc.nextLine());
//        Integer[] minCount = new Integer[20];
//        Integer[] maxCount = new Integer[20];
//        for (int i = 0; i < arr.length; i++) {
//            minCount[i] = arr[i] - min;
//            maxCount[i] = max - arr[i];
//        }
//        System.out.println();
//        int minArr=minCount[0];
//        int maxArr =maxCount[0];
//        int minIndex = 0, maxIndex = 0;
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(minCount[i] +",");
//        }
//        System.out.println("hoho");
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(maxCount[i] +",");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if(minArr < minCount[i]) {
//                minArr=minCount[i];
//                minIndex=i;
//            }
//            if(maxArr < maxCount[i]) {
//                maxArr=maxCount[i];
//                maxIndex=i;
//            }
//        }
//        System.out.println("Minimum number nearly is: " + (minArr+min) + " index :"+minIndex + " arr[index]: " + arr[minIndex]);
//        System.out.println("Maximum number nearly is: " + (max-maxArr)+ " index :"+maxIndex+" arr[index]: " + arr[maxIndex]);
//    }
private static Integer[] getArr() {
    Integer arr[] = new Integer[20];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() * 100);
    }
    Arrays.sort(arr);
    return arr;
}

    public static void main(String[] args) {
        // Step 1: Create array
        Integer[] arr = getArr();
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Step 2: Get min and max from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min value: ");
        int min = scanner.nextInt();
        System.out.print("Enter max value: ");
        int max = scanner.nextInt();

        // Step 3: Find the closest numbers
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (minIndex == -1 && arr[i] > min) {
                minIndex = i;
            }
            if (arr[i] < max) {
                maxIndex = i;
            }
        }

        // Step 4: Print the results
        if (minIndex != -1 && maxIndex != -1 && minIndex <= maxIndex) {
            System.out.println("Count of numbers found: " + (maxIndex - minIndex + 1));
            System.out.println("Details of numbers found: ");
            for (int i = minIndex; i <= maxIndex; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("No numbers found in the specified range.");
        }
    }
}
