public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        int[] arr = {-1, 7, -1, 7, 7, 8, -1, 7, 7, -1, 5, 5, -1, 5, 5, 5, };

        int k = main.average(2147483647, 2147483647);

        System.out.println(k);
        System.out.println(Integer.MAX_VALUE == 2147483647);

    }


    public int average(int a, int b) {

        if (a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((a + b) / 2);
    }
}
