import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number to be printed: ");
        int num = scanner.nextInt();
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Calling the method to print the pattern
        printPattern(num, maxTimes);

        // Closing the scanner
        scanner.close();
    }

    // Function to print the pattern
    static void printPattern(int num, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        for (int i = maxTimes - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= maxTimes - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}

OUTPUT:
C:\Users\BHAVATHARANI\Desktop>javac PatternPrint.java

C:\Users\BHAVATHARANI\Desktop>java PatternPrint
Enter the number to be printed: 4
Max Number of times to be printed: 5
4
44
444
4444
44444
4444
444
44
4
    4
   44
  444
 4444
44444
