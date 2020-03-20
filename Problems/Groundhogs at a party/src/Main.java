import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if ( ((quantity>=10 && quantity<=20) && !isWeekend) || ((quantity>=15 && quantity<=25) && isWeekend)){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}