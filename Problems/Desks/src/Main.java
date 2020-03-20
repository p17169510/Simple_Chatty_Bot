import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){

            int firstClass = scanner.nextInt();
            int secondClass = scanner.nextInt();
            int thirdClass = scanner.nextInt();

            int result = firstClass/2 + firstClass%2 + secondClass/2 + secondClass%2 + thirdClass/2 + thirdClass%2;
            System.out.println(result);
            
//            int desks1 = (firstClass + firstClass%2)/2;
//            int desks2 = (secondClass + secondClass%2)/2;
//            int desks3 = (thirdClass + thirdClass%2)/2;
//
//            System.out.println(desks1+desks2+desks3);
        }
    }
}