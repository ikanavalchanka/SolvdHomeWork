package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.InvalidRoomAssignmentException;
import com.solvd.Hospital.exceptions.InvalidShiftOperationException;

class Nurse extends Person implements PatientManagement, ShiftManagement {
    private String nurseDepartment;
    private int yearsOfExperience;
    private NurseShiftRegistry shiftRegistry;

    public Nurse(String name, int age, String gender, String nurseDepartment, int yearsOfExperience) {
        super(name, age, gender);
        this.nurseDepartment = nurseDepartment;
        this.yearsOfExperience = yearsOfExperience;
        this.shiftRegistry = new NurseShiftRegistry();
    }

    @Override
    public void addPatient(Patient patient) {
        System.out.println(name + " is adding patient " + patient.getName());
    }

    @Override
    public void removePatient(Patient patient) {
        System.out.println(name + " is removing patient " + patient.getName());
    }

    @Override
    public void assignRoom(Patient patient, Room room) throws InvalidRoomAssignmentException {

    }

    @Override
    public void startShift() throws InvalidShiftOperationException {
        if (shiftRegistry.getShift(name).equals("No shift assigned")) {
            shiftRegistry.addShift(name, "Active");
            System.out.println(name + " has started the shift.");
        } else {
            throw new InvalidShiftOperationException(name + " cannot start the shift because it's already active.");
        }
    }

    @Override
    public void endShift() throws InvalidShiftOperationException {
        if (!shiftRegistry.getShift(name).equals("No shift assigned")) {
            shiftRegistry.endShift(name);
            System.out.println(name + " has ended the shift.");
        } else {
            throw new InvalidShiftOperationException(name + " cannot end the shift because no shift has been started.");
        }
    }

    public String getNurseDepartment() {
        return nurseDepartment;
    }

    public void setNurseDepartment(String nurseDepartment) {
        this.nurseDepartment = nurseDepartment;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String personDescription() {
        return "Nurse in " + nurseDepartment + " with " + yearsOfExperience + " years of experience.";
    }

    @Override
    public String toString() {
        return "Nurse [Name: " + name + ", Department: " + nurseDepartment + ", Age: " + age + ", Gender: " + gender + ", Experience: " + yearsOfExperience + " years]";
    }
}