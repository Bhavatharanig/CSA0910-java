import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of names
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();

        // Input the names
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i <= numNames; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(scanner.next());
        }

        // Input the sorting order
        System.out.print("Enter sorting order (A for Ascending, D for Descending): ");
        char sortOrder = scanner.next().toUpperCase().charAt(0);

        // Perform sorting based on user choice
        if (sortOrder == 'A') {
            Collections.sort(names); // Ascending order
        } else if (sortOrder == 'D') {
            Collections.sort(names, Collections.reverseOrder()); // Descending order
        } else {
            System.out.println("Invalid sorting order. Please enter A or D.");
            return;
        }

        // Display the sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}


OUTPUT:
C:\Users\BHAVATHARANI\Desktop>javac NameSorter.java

C:\Users\BHAVATHARANI\Desktop>java NameSorter
Enter the number of names: 3
Enter name 1: apple
Enter name 2: orange
Enter name 3: strawberray
Enter sorting order (A for Ascending, D for Descending): a
Sorted names:
apple
orange
strawberray
