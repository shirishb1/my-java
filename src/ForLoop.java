public class ForLoop {
    public static void main(String[] args) {
        // printing the square of a number
        for (int i = 1; i <= 10; i++) {
            SquareCalc(i);

        }
        // printing multiplication of a table
        for (int i = 1; i <= 10; i++) {
            MultiplicationTable(i);
        }
        // printing multiplication table in reverse
        for (int i = 10; i >= 1; i--) {
            ReverseMultiplication(i);
        }

    }

    public static void SquareCalc(int i) {
        int j = i * i;
        System.out.println("The square of " + i + " is " + j);
    }

    public static void MultiplicationTable(int i) {
        int j = 7 * i;
        System.out.println("The table 7  is " + j);
    }

    public static void ReverseMultiplication(int i) {
        int j = 8 * i;
        System.out.println("The table 8  is " + j);
    }
}