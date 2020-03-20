import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightBus = sc.nextInt();
        int numberOfBridges = sc.nextInt();
        int currentBridge;
        boolean willCrush = false;

        for (int i = 0; i < numberOfBridges; i++) {
            currentBridge = sc.nextInt();
            if (currentBridge <= heightBus) {
                willCrush = true;
                System.out.println("Will crash on bridge " + (i+1));
                break;
            }
        }
        if (!willCrush) {
            System.out.println("Will not crash");
        }
    }
}