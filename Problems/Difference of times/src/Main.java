import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int firstHour = scanner.nextInt();
            int firstMin = scanner.nextInt();
            int firstSec = scanner.nextInt();

            int secondHour = scanner.nextInt();
            int secondMin = scanner.nextInt();
            int secondSec = scanner.nextInt();

            int result = Math.abs(
            (86400 - firstHour*3600 - firstMin*60 - firstSec) -
            (86400 - secondHour*3600 - secondMin*60 - secondSec));

            System.out.print(result);
        }
    }
}