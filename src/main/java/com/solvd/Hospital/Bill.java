package com.solvd.Hospital;

class Bill {
private Patient patient;
private double totalAmount;

public Bill(Patient patient, double totalAmount) {
    this.patient = patient;
    this.totalAmount = totalAmount;
}

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
public String toString() {
    return "Bill for patient " + patient.getName() + ": $" + totalAmount;
}
}