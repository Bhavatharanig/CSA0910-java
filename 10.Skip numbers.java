import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values M, N, and K
        System.out.print("Enter the starting number (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the ending number (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of steps to skip (K): ");
        int K = scanner.nextInt();

        // Validate input
        if (M > N || K <= 0) {
            System.out.println("Invalid input. Please ensure M <= N and K > 0.");
            return;
        }

        // Print numbers from M to N, skipping K numbers in between
        System.out.println("Numbers from " + M + " to " + N + " with a step of " + K + ":");

        for (int i = M; i <= N; i += K) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

OUTPUT:
C:\Users\BHAVATHARANI\Desktop>javac SkipNumbers.java

C:\Users\BHAVATHARANI\Desktop>java SkipNumbers
Enter the starting number (M): 60
Enter the ending number (N): 120
Enter the number of steps to skip (K): 5
Numbers from 60 to 120 with a step of 5:
60 65 70 75 80 85 90 95 100 105 110 115 120
