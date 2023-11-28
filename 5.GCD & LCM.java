import java.util.Scanner;

public class LCMGCDCalculator {

    // Function to find GCD of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM of two numbers
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Function to find GCD of an array of numbers
    public static int findArrayGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findGCD(result, numbers[i]);
        }
        return result;
    }

    // Function to find LCM of an array of numbers
    public static int findArrayLCM(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findLCM(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display GCD
        int gcd = findArrayGCD(numbers);
        System.out.println("GCD of the numbers: " + gcd);

        // Calculate and display LCM
        int lcm = findArrayLCM(numbers);
        System.out.println("LCM of the numbers: " + lcm);

        scanner.close();
    }
}

OUTPUT:
C:\Users\BHAVATHARANI\Desktop>javac LCMGCDCalculator.java

C:\Users\BHAVATHARANI\Desktop>java LCMGCDCalculator
Enter the number of elements: 4
Enter the elements:
12
21
23
32
GCD of the numbers: 1
LCM of the numbers: 15456
