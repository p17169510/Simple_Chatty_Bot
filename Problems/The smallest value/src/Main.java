import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputM = sc.nextLong();
        long sum = 1L;
        int n = 1;

        while (sum <= inputM) {
            n++;
            sum = sum * n;
        }
        System.out.println(n);

//        do {
//            n++;
//            sum = sum * n;
//        } while (sum <= inputM);
//        System.out.print(n);

//        for (n = 1; inputM >= sum; n++){
//            sum = sum*n;
//        }
//        System.out.println(n-1);





    }
}