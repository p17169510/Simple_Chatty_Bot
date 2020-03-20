import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        /*  3rd solution */
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine().replace(" ", "").equals
                          (scanner.nextLine().replace(" ", "")));

//        /* 2nd solution */
//        Scanner scanner = new Scanner(System.in);
//        String firstLine = scanner.nextLine().replace(" ", "");
//        String secondLine = scanner.nextLine().replace(" ", "");
//        System.out.println(firstLine.equals(secondLine));


            /* 1st solution */
//        Scanner scanner = new Scanner(System.in);
//        String firstLine = scanner.nextLine();
//        String secondLine = scanner.nextLine();
//
//        String replacedFirstLine = firstLine.replace(" ", "");
//        String replacedSecondLine = secondLine.replace(" ", "");
//
//        System.out.println(replacedFirstLine.equals(replacedSecondLine));
        }
    }
