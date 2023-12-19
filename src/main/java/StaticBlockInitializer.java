import java.util.Scanner;

public class StaticBlockInitializer {
    public static void main(String[] args) {}

    private static void calculateArea(int breadth, int height) throws Exception {
        if (breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            throw new Exception("Breadth and height must be positive");
        }
    }

    static {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        try {
            StaticBlockInitializer.calculateArea(breadth, height);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
