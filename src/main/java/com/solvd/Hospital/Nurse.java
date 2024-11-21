package com.solvd.Hospital;

class Nurse extends Person implements PatientManagement, ShiftManagement {
    private String nurseDepartment;
    private int yearsOfExperience;

    public Nurse(String name, int age, String gender, String nurseDepartment, int yearsOfExperience) {
        super(name, age, gender);
        this.nurseDepartment = nurseDepartment;
        this.yearsOfExperience = yearsOfExperience;
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
    public void startShift() {
        System.out.println(name + " has started the shift.");
    }

    @Override
    public void endShift() {
        System.out.println(name + " has ended the shift.");
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
