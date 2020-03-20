import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.print(inputNumber + " ");

        while (inputNumber != 1)
        {
            if (inputNumber % 2 == 0) {
                inputNumber = inputNumber / 2;  // inputNumber = inputNumber / 2
                System.out.print(inputNumber + " ");
            } else {
                inputNumber = inputNumber * 3 + 1;
                System.out.print(inputNumber + " ");
            }
        }
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int inputNumber = scanner.nextInt();
//        System.out.print(inputNumber + " ");
////       int finish;
//
//        if (inputNumber ==1) {
//        }
//
//        else {
//            do {
//                if (inputNumber % 2 == 0) {
//                    inputNumber = inputNumber / 2;  // inputNumber = inputNumber / 2
//                    System.out.print(inputNumber + " ");
//                } else {
//                    inputNumber = inputNumber * 3 + 1;
//                    System.out.print(inputNumber + " ");
//                }
//
//
//            } while (inputNumber != 1);
//        }
//    }
//}