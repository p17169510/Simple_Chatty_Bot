import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // учебная задача: является лии число простым
//        Scanner sc = new Scanner(System.in);
//        int inputInt = sc.nextInt();
//        while (inputInt != 777) {
//            boolean prime = true;
//            if (inputInt <2) prime = false;
//            if (inputInt >=2) {
//                for (int i = 2; i < inputInt; i++){
//                    if (inputInt % i == 0) {
//                        prime = false;
//                        break;
//                    }
//                }
//            }
//            System.out.println(prime + " ");
//            inputInt = sc.nextInt();
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            }
            else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
        //учебная задача: треугольник последовательности цифр 1 до 9
//        for (int i = 1; i <= 9; i++){
//            for (int j = 1; j <=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }



    }
}