package homework;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap ptu thu: " + i);
            arr[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Tim so");
        int tim = Integer.parseInt(sc.next());
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (tim == arr[i]) {
                System.out.println("Co tim thay");
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("LN: " + max);
    }
}
