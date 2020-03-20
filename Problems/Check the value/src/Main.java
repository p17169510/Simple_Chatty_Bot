import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();

        System.out.println(inputInt > 0 && inputInt < 10);

//        boolean inRange = (inputInt > 0) && (inputInt < 10);
//        System.out.println(inRange);
    }
}