import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int sum = 0;

        while ((input = sc.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }

//        int number = sc.nextInt();
//        int sum = 0;
//
//        while (number != 0){
//            sum += number;
//            if (sum >= 1000) {
//                sum -= 1000;
//                break;
//            }
//            number = sc.nextInt();
//        }
        System.out.println(sum);
    }
}