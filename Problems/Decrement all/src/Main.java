import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            int fourth = scanner.nextInt();

            System.out.println(--first + " " + --second + " " + --third + " " + --fourth);

        }
    }
}