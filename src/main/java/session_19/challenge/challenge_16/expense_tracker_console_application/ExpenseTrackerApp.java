package session_19.challenge.challenge_16.expense_tracker_console_application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Edit Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. View Total Expenses");
            System.out.println("6. Export Expenses");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter date (yyyy-MM-dd): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine(), dateFormatter);
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    manager.addExpense(category, amount, date, description);
                    break;
                case 2:
                    manager.viewExpenses();
                    break;
                case 3:
                    System.out.print("Enter the index of the expense to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new category: ");
                    String newCategory = scanner.nextLine();
                    System.out.print("Enter new amount: ");
                    double newAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new date (yyyy-MM-dd): ");
                    LocalDate newDate = LocalDate.parse(scanner.nextLine(), dateFormatter);
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    manager.editExpense(editIndex, newCategory, newAmount, newDate, newDescription);
                    break;
                case 4:
                    System.out.print("Enter the index of the expense to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    manager.deleteExpense(deleteIndex);
                    break;
                case 5:
                    System.out.print("Enter start date (yyyy-MM-dd): ");
                    LocalDate startDate = LocalDate.parse(scanner.nextLine(), dateFormatter);
                    System.out.print("Enter end date (yyyy-MM-dd): ");
                    LocalDate endDate = LocalDate.parse(scanner.nextLine(), dateFormatter);
                    manager.viewTotalExpenses(startDate, endDate);
                    break;
                case 6:
                    System.out.print("Enter the filename to export expenses: ");
                    String fileName = scanner.nextLine();
                    manager.exportExpenses(fileName);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}