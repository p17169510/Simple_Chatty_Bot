class Main {
    public static void main(String[] args) {
        int n = 2025;

        int magic = 0;
        while (n > 0) {
            n /= 10;
            magic++;
            System.out.println("magic "+ magic);
            System.out.println(0%2);
        }
        System.out.println("n=="+n);



        int i = 0;
        while (i < 10) {
            ++i;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}