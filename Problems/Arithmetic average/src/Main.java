import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0, iterator = 0;

        for (int i= a; i <= b; i++ ){
            if (i%3==0){
                count = count + i;
                iterator++;
            }
        }
        double result = count/ (double) iterator;
        System.out.println(result);
    }
}