package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap 1");
//        String s = sc.nextLine();
//        String[] words = s.split("");
//        Stream<String> arr = Arrays.stream(words).sorted();
//
//        arr.forEach(word -> System.out.print(word + " "));
        // Define the main string and the substring to search for
        String mainString = "abcabcdgaxyz";
        String substring = "abcdg";

        // Check if the substring exists in the main string
        if (mainString.contains(substring)) {
            System.out.println("The substring \"" + substring + "\" was found in the string \"" + mainString + "\".");
        } else {
            System.out.println("The substring \"" + substring + "\" was not found in the string \"" + mainString + "\".");
        }
    }
}
