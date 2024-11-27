package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.PaymentProcessingException;

import java.io.FileWriter;
import java.io.IOException;

class Payment {
    private double amount;
    private String paymentDate;

    public Payment(double amount, String paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment of " + amount + " made on " + paymentDate;
    }

    public void processPayment() {
        try (FileWriter writer = new FileWriter("payment_logs.txt", true)) {
            if (amount <= 0) {
                throw new PaymentProcessingException("Invalid payment amount: " + amount);
            }
            writer.write("Payment processed: $" + amount + " on " + paymentDate + "\n");
            System.out.println("Payment of $" + amount + " processed successfully.");
        } catch (IOException e) {
            System.out.println("Error: Failed to write payment log.");
            HospitalLogger.log.severe("File writing failed: " + e.getMessage());
        } catch (PaymentProcessingException e) {
            System.out.println("Error: " + e.getMessage());
            HospitalLogger.log.warning("Payment processing failed: " + e.getMessage());
        }
    }
}