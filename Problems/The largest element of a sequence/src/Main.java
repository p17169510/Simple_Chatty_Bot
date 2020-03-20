import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber;
        int basicNumber = 0;

        do {
            currentNumber = scanner.nextInt();
            if (currentNumber > basicNumber) {
                basicNumber = currentNumber;
            }
        } while (currentNumber !=0);
        System.out.println(basicNumber);
    }
}