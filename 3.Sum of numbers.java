import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of 'n'
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Input 'n' numbers
        System.out.println("Enter " + n + " numbers:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of the entered numbers: " + sum);

        // Close the scanner
        scanner.close();
    }
}

OUTPUT:
C:\Users\BHAVATHARANI\Desktop>javac SumOfNumbers.java

C:\Users\BHAVATHARANI\Desktop>java SumOfNumbers
Enter the value of n: 4
Enter 4 numbers:
8
10
1
13
Sum of the entered numbers: 32
