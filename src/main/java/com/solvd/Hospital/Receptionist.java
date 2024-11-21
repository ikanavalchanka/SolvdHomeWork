package com.solvd.Hospital;

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
        System.out.println(name + " processed payment of " + payment.getAmount());
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