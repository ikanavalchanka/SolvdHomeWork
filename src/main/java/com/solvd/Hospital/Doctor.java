package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.InvalidRoomAssignmentException;
import com.solvd.Hospital.exceptions.PatientLimitExceededException;

import java.util.ArrayList;
import java.util.List;

class Doctor extends Person implements Treatable, PatientManagement {
    private static final int MAX_PATIENTS = 5;
    private final List<Patient> patients = new ArrayList<>();
    private String speciality;

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
        try {
            if (patients.size() >= MAX_PATIENTS) {
                throw new PatientLimitExceededException("Cannot add more patients. Limit is " + MAX_PATIENTS + ".");
            }
            patients.add(patient);
            System.out.println("Patient " + patient.getName() + " added successfully.");
        } catch (PatientLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
            HospitalLogger.log.warning("Patient limit exceeded for " + name + ": " + e.getMessage());
        }
    }

    @Override
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }


    @Override
    public void assignRoom(Patient patient, Room room) throws InvalidRoomAssignmentException {

        room.assignRoom(patient);
    }
}
