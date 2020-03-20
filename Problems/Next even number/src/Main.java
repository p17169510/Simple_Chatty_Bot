import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int inputInt = scanner.nextInt();
            int result = inputInt - inputInt%2 + 2;
            System.out.println(result);
//            int remainder = inputInt%2;
//
//            if (remainder == 0){
//                System.out.println(inputInt+2);
//            }
//            else {
//                System.out.println(inputInt + 1);
//            }
        }
    }
}