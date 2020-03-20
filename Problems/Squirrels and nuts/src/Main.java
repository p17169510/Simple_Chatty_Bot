import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int squirrels = scanner.nextInt();
//        int nuts = scanner.nextInt();
//        System.out.println(nuts%squirrels);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }
}