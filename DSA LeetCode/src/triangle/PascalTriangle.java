package triangle;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   "); // Print spaces for formatting
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", number); // Print the number with formatting
                number = number * (i - j) / (j + 1);
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
