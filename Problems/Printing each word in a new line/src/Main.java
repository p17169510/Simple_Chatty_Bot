import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String word1 = sc.next();
            String word2 = sc.next();
            String word3 = sc.next();
            String word4 = sc.next();
            String word5 = sc.next();

            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
            System.out.println(word4);
            System.out.print(word5);
        }
        sc.close();
    }
}