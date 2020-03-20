//import java.util.*;
//
//public class Main {
//
//    public static String[] reverse(String... words) {
//        String temp;
//        for (int i = 0; i < words.length / 2; i++) {
//            temp = words[i];
//            words[i] = words[words.length - 1 - i];
//            words[words.length - 1 - i] = temp;
//        }
//        return words;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] words = scanner.nextLine().split("\\s+");
//        String[] reversed = reverse(words);
//        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
//    }
//}
//
//
//


import java.util.*;

public class Main {

    public static String[] reverse(String... words) {
        String[] reversed = new String[words.length];
        for (int i = 0 ; i < words.length; i++){
            reversed[i] = words[(words.length-1)-i];
        }
        return reversed;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}