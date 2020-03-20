import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (sc.hasNext()){
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number %2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }





//        int inputInt = sc.nextInt();
//        do {
//            if (inputInt % 2 == 0) {
//                if (inputInt == 0) {
//                    break;
//                }
//                System.out.println("even");
//            }
//            else if (inputInt % 2 !=0) {
//                System.out.println("odd");
//            }
//            inputInt = sc.nextInt();
//        } while (inputInt != 0);


    }
}