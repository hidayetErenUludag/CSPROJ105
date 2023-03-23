public class voiceTest {
    public static void main(String[] args) {
        for (double y = 0; y < 1; y += 0.0001) {
            double result = 900 * (7.0 / 5.0) * y - 500 * y;
            System.out.println("Testing y = " + y + ", result = " + result);
            if (result == 20) {
                System.out.println("Solution found: y = " + y);
            }
        }
    }
}