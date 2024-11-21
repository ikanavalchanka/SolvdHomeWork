package com.solvd.Hospital;

import java.util.ArrayList;
import java.util.List;

class Doctor extends Person implements Treatable, PatientManagement {
    private String speciality;
    private static final int MAX_PATIENTS = 20; // Final variable
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name, int age, String gender, String speciality) {
        super(name, age, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String personDescription() {
        return "Doctor specializing in " + speciality;
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println(name + " is treating " + patient.getName());
    }

    @Override
    public void addPatient(Patient patient) {
        if (patients.size() < MAX_PATIENTS) {
            patients.add(patient);
        } else {
            System.out.println("Cannot add more patients. Maximum limit reached.");
        }
    }

    @Override
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }
}


