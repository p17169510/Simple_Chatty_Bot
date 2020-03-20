import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double putedMoney = sc.nextInt();
        double percent = sc.nextInt();
        double wantedMoney = sc.nextInt();
        int years = 0;
        double tempReached = putedMoney;

        while (tempReached < wantedMoney) {
            tempReached += tempReached * percent / 100;
            years++;
        }

        System.out.println(years);
    }
}