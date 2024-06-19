// Import necessary library
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner instance to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        // A formula for calculating profit
        int profit = 202 + 118 + 2250 + 1680 + 1075 + 80;
        System.out.println(String.format("Income: $%d", profit));
        System.out.println("Staff expenses:");
        
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        
        int otherExpenses = scanner.nextInt();
        int profitAfterExpenses = profit - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%d", profitAfterExpenses);

        // Close the scanner when done
        scanner.close();
    }
}
