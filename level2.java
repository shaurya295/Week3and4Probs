import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Level 2 Menu ---");
            System.out.println("1. Find Multiples below 100");
            System.out.println("2. Power of a Number");
            System.out.println("3. Multiples below 100 (While Loop)");
            System.out.println("4. Power of a Number (While Loop)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 1: findMultiples(input); break;
                case 2: calculatePower(input); break;
                case 3: findMultiplesWhile(input); break;
                case 4: calculatePowerWhile(input); break;
                default: System.out.println("Invalid choice.");
            }
        }
        input.close();
    }

    // Problem 11: Multiples of a number below 100 using for loop 
    public static void findMultiples(Scanner input) {
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i = 100; i >= 1; i--) {
            if (i % num == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    // Problem 12: Power of a number using for loop 
    public static void calculatePower(Scanner input) {
        System.out.print("Enter number and power: ");
        int num = input.nextInt(), p = input.nextInt();
        long result = 1;
        for (int i = 1; i <= p; i++) result *= num;
        System.out.println("Result: " + result);
    }

    // Problem 13: Multiples below 100 using while loop 
    public static void findMultiplesWhile(Scanner input) {
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int counter = 100;
        while (counter >= 1) {
            if (counter % num == 0) System.out.print(counter + " ");
            counter--;
        }
        System.out.println();
    }

    // Problem 14: Power of a number using while loop 
    public static void calculatePowerWhile(Scanner input) {
        System.out.print("Enter number and power: ");
        int num = input.nextInt(), p = input.nextInt();
        long result = 1;
        int counter = 0;
        while (counter < p) {
            result *= num;
            counter++;
        }
        System.out.println("Result: " + result);
    }
}