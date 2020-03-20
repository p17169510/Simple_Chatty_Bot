import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;

        while (count < n) {
            for ( int j = 0 ; j < i ; j++ ) {
                if (count == n) {
                    break;
                }
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }
}



























//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int quantity = sc.nextInt();
//        int count = 0;
//
//
//            outer:for (int i = 1; count < quantity ; i++) {
//                for (int j = 0; j < i; j++) {
//                    if (count == quantity) {
//                        break outer;
//                    }
//                    System.out.print(i + " ");
//                    count++;
//                }
//            }
//
//        }
//    }


//
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int quantity = scanner.nextInt();
//        int i = 1;
//        int count = 0;
//
//        while (count < quantity) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(i + " ");
//                count += 1;
//
//                if (count == quantity) {
//                    break;
//                }
//            }
//            i += 1;
//        }
//    }
//}