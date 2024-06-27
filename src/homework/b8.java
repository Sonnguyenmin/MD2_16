package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class b8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String s = sc.nextLine();
        String[] words = s.split("");
        Stream<String> sorted = Arrays.stream(words).sorted();
        System.out.println("The words in " + s + " are: ");
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(sorted[i] + " ");
//        }
        sorted.forEach(System.out::print);
    }
}
