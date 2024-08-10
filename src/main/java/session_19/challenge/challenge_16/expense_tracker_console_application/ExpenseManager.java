package session_19.challenge.challenge_16.expense_tracker_console_application;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String category, double amount, LocalDate date, String description) {
        expenses.add(new Expense(category, amount, date, description));
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    public void editExpense(int index, String category, double amount, LocalDate date, String description) {
        if (index >= 0 && index < expenses.size()) {
            Expense expense = expenses.get(index);
            expense.setCategory(category);
            expense.setAmount(amount);
            expense.setDate(date);
            expense.setDescription(description);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteExpense(int index) {
        if (index >= 0 && index < expenses.size()) {
            expenses.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void viewTotalExpenses(LocalDate startDate, LocalDate endDate) {
        double total = 0.0;
        for (Expense expense : expenses) {
            if (!expense.getDate().isBefore(startDate) && !expense.getDate().isAfter(endDate)) {
                total += expense.getAmount();
            }
        }
        System.out.println("Total expenses from " + startDate + " to " + endDate + ": $" + total);
    }

    public void exportExpenses(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Expense expense : expenses) {
                writer.write(expense.toString());
                writer.newLine();
            }
            System.out.println("Expenses exported to " + fileName);
        } catch (IOException e) {
            System.out.println("Error exporting expenses: " + e.getMessage());
        }
    }
}