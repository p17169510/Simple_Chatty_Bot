public static int getNumberOfMaxParam(int a, int b, int c) {
    return a >= b && a >= c ? 1 : b >= c ? 2 : 3;
}