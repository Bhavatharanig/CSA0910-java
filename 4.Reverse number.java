import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseNumber(number);

        // Display the reversed number
        System.out.println("Reversed Number: " + reversedNumber);

        // Close the Scanner
        scanner.close();
    }

    // Function to reverse a given number
    private static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}

OUTPUT:
C:\Users\BHAVATHARANI\Desktop>javac ReverseNumber.java

C:\Users\BHAVATHARANI\Desktop>java ReverseNumber
Enter a number: 2314567
Reversed Number: 7654132
