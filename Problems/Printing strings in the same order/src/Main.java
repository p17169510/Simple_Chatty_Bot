import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1, line2, line3, line4;

        while(sc.hasNext()){
                line1 = sc.next();
                line2 = sc.next();
                line3 = sc.next();
                line4 = sc.next();

            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.print(line4);
            }
        sc.close();

        }
    }