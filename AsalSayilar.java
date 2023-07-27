public class AsalSayilar {
    public static void main(String[] args) {

        // Asal sayılar 1 den ve kendisinden başka tam böleni olmayan sayılardır.

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
