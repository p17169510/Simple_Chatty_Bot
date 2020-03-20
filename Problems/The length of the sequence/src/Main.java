import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber, counter = 0;

        while (sc.hasNext()){
            inputNumber = sc.nextInt();
            if (inputNumber == 0) {
                break;
            }
            else {
                counter++;
            }
        }
        System.out.println(counter);

//        int inputInt = sc.nextInt();
//        int counter = 0;
//        while (inputInt != 0) {
//            inputInt = sc.nextInt();
//            counter++;
//        }
//        System.out.println(counter);


//        int inputInt;
//        int counter = 0;
//        do {
//            inputInt = sc.nextInt();
//            if (inputInt!=0){
//                counter++;
//            }
//        } while (inputInt != 0);
//        System.out.println(counter);
    }
}