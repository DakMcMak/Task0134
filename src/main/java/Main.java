public class Main {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        int liters;
        liters = a * b * c * 1000;
        return liters;
    }
}

