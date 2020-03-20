import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short quantity = sc.nextShort();
        short count = 0;
        short maxDividable = 4;

        while (count < quantity){
            short currentNum = sc.nextShort();
            if (currentNum%4==0 && currentNum>maxDividable){
                maxDividable = currentNum;
            }
            count++;
        }
        System.out.println(maxDividable);

    }
}