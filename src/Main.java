public class Main {
    public static void main(String[] args) {

        System.out.println("Результат: " + dev(14));
    }

    public static int dev(int n) {
        int result = 20;
        for (int count = 0; count < n; count++) {
            result = result - count;
        }
        return result + 1;
    }
}