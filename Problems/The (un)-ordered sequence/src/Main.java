import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ordered = true;
        boolean asc = true;

        int number1 = sc.nextInt();
        int number2 = 0;

        while (sc.hasNext()) {
            number2 = sc.nextInt();

            if (number2 == 0) {
                System.out.println(ordered);
            }

            else if (number1 > number2) {
                asc = false;
                break;
            }

            else if (number1 < number2) {
                asc = true;
                break;
                }
            number1 = number2;
        }

        while (sc.hasNext()) {
            number1 = number2;
            number2 = sc.nextInt();

            if (number2 == 0) {
                System.out.println(ordered);
                break;
            }

            else if (number1 > number2 && !asc ||
                    number1 < number2 && asc ||
                    number1 == number2) {
                continue;
            }

            else {
                System.out.println(!ordered);
                break;
            }

        }

    }
}