package session_19.challenge.challenge_16.expense_tracker_console_application;

import java.time.LocalDate;

public class Expense {
    private String category;
    private double amount;
    private LocalDate date;
    private String description;

    public Expense(String category, double amount, LocalDate date, String description) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    // Getters and Setters
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Category: " + category + ", Amount: " + amount + ", Date: " + date + ", Description: " + description;
    }
}