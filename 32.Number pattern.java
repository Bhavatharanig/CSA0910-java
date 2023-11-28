public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // Print the leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print the square of each number in the row
            for (int j = 1; j <= i; j++) {
                int number = i * i;
                System.out.print(number);

                // Print spaces between numbers
                if (j < i) {
                    System.out.print("   ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

OUTPUT:
C:\Users\BHAVATHARANI\Documents>javac NumberPattern.java

C:\Users\BHAVATHARANI\Documents>java NumberPattern
      1
    4   4
  9   9   9
16   16   16   16
