package ArrayCheak;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 0};
        try {
            for (int i = -1; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("elements successfully printed.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
