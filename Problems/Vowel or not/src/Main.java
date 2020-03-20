import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char vovel[] = {'a', 'e', 'i', 'o', 'u'};
        Character.toLowerCase(ch);

        for (int i = 0; i < vovel.length; i++){
            if (ch == vovel[i]) {
                return true;
            };
        }
        return false;

//        return Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}