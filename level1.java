import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Level 1 Menu ---");
            System.out.println("1. Triangle Angles Check");
            System.out.println("2. Smallest of Three");
            System.out.println("3. Number Status (+/-/0)");
            System.out.println("4. Divisibility (5 & 11)");
            System.out.println("5. Voting Eligibility");
            System.out.println("6. Profit or Loss");
            System.out.println("7. Leap Year Check");
            System.out.println("8. Countdown");
            System.out.println("9. Print Natural Numbers");
            System.out.println("10. Sum Natural Numbers");
            System.out.println("11. Sum Until 0 or Negative");
            System.out.println("12. Compare Sum Methods");
            System.out.println("13. Factorial Calculation");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1: checkTriangleAngles(input); break;
                case 2: findSmallestOfThree(input); break;
                case 3: checkNumberStatus(input); break;
                case 4: checkDivisibility(input); break;
                case 5: checkVotingEligibility(input); break;
                case 6: calculateProfitOrLoss(input); break;
                case 7: checkLeapYear(input); break;
                case 8: printCountdown(input); break;
                case 9: printNaturalNumbers(input); break;
                case 10: sumNaturalNumbers(input); break;
                case 11: sumUntilZeroOrNegative(input); break;
                case 12: compareSumMethods(input); break;
                case 13: calculateFactorial(input); break;
                default: System.out.println("Invalid choice.");
            }
        }
        input.close();
    }

    public static void checkTriangleAngles(Scanner input) {
        System.out.print("Enter 3 angles: ");
        int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();
        if ((x + y + z) == 180 && x > 0 && y > 0 && z > 0) System.out.println("Valid Triangle");
        else System.out.println("Not a Triangle");
    }

    public static void findSmallestOfThree(Scanner input) {
        System.out.print("Enter 3 numbers: ");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();
        int smallest = (n1 < n2) ? (Math.min(n1, n3)) : (Math.min(n2, n3));
        System.out.println("Smallest: " + smallest);
    }

    public static void checkNumberStatus(Scanner input) {
        System.out.print("Enter number: ");
        int num = input.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    public static void checkDivisibility(Scanner input) {
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println((num % 5 == 0 && num % 11 == 0) ? "Divisible by 5 and 11" : "Not divisible");
    }

    public static void checkVotingEligibility(Scanner input) {
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.println((age >= 18) ? "Eligible" : "Not eligible");
    }

    public static void calculateProfitOrLoss(Scanner input) {
        System.out.print("Enter Cost Price and Selling Price: ");
        double cp = input.nextDouble(), sp = input.nextDouble();
        if (sp > cp) System.out.println("Profit: " + (sp - cp));
        else if (cp > sp) System.out.println("Loss: " + (cp - sp));
        else System.out.println("No Profit/Loss");
    }

    public static void checkLeapYear(Scanner input) {
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) System.out.println("Leap Year");
        else System.out.println("Not Leap Year");
    }

    public static void printCountdown(Scanner input) {
        System.out.print("Enter start number: ");
        int counter = input.nextInt();
        while (counter >= 1) System.out.print(counter-- + " ");
        System.out.println();
    }

    public static void printNaturalNumbers(Scanner input) {
        System.out.print("Enter N: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();
    }

    public static void sumNaturalNumbers(Scanner input) {
        System.out.print("Enter N: ");
        int n = input.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum: " + sum);
    }

    public static void sumUntilZeroOrNegative(Scanner input) {
        System.out.println("Enter numbers to sum (0 or negative to stop):");
        double total = 0;
        while (true) {
            double num = input.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total: " + total);
    }

    public static void compareSumMethods(Scanner input) {
        System.out.print("Enter N: ");
        int n = input.nextInt();
        if (n <= 0) return;
        int formula = n * (n + 1) / 2;
        int loopSum = 0;
        for (int i = 1; i <= n; i++) loopSum += i;
        System.out.println("Formula: " + formula + " | Loop: " + loopSum);
    }

    public static void calculateFactorial(Scanner input) {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
}