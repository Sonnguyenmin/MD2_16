package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class b13 {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        IntStream seamt = Arrays.stream(arr).sorted();
        System.out.println(Arrays.toString(seamt.toArray()));
    }
}
