package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.PaymentProcessingException;

import java.io.FileWriter;
import java.io.IOException;

class Receptionist extends Person implements PaymentsProcess, ShiftManagement {
    private int receptionistId;
    private String workingShift;

    public Receptionist(String name, int age, String gender, int receptionistId, String workingShift) {
        super(name, age, gender);
        this.receptionistId = receptionistId;
        this.workingShift = workingShift;
    }

    @Override
    public void processPayment(Payment payment) {
        try (FileWriter writer = new FileWriter("payment_logs.txt", true)) {
            if (payment.getAmount() <= 0) {
                throw new PaymentProcessingException("Invalid payment amount: " + payment.getAmount());
            }
            writer.write("Payment processed: $" + payment.getAmount() + " on " + payment.getPaymentDate() + "\n");
            System.out.println("Payment processed successfully.");
        } catch (IOException e) {
            System.out.println("Error: Failed to write payment log.");
            HospitalLogger.log.severe("File writing failed: " + e.getMessage());
        } catch (PaymentProcessingException e) {
            System.out.println("Error: " + e.getMessage());
            HospitalLogger.log.warning("Payment processing failed: " + e.getMessage());
        }
    }

    @Override
    public void startShift() {
        System.out.println(name + " has started the shift.");
    }

    @Override
    public void endShift() {
        System.out.println(name + " has ended the shift.");
    }

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    @Override
    public String personDescription() {
        return "Receptionist working in " + workingShift + " shift.";
    }

    @Override
    public String toString() {
        return "Receptionist [Name: " + name + ", Shift: " + workingShift + ", Age: " + age + ", Gender: " + gender + "]";
    }
}