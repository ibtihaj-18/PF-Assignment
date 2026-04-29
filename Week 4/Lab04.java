public class Lab04 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        int m = a > b ? a : b;
        return m > c ? m : c;
    }
}