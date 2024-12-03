package com.solvd.Hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalRegistry {
    private static List<Patient> allPatients = new ArrayList<>();
    private static List<Person> allStaff = new ArrayList<>();

    public static void registerPatient(Patient patient) {
        allPatients.add(patient);
        System.out.println("Patient " + patient.getName() + " registered.");
    }

    public static void registerStaff(Person staff) {
        allStaff.add(staff);
        System.out.println("Staff member " + staff.getName() + " registered.");
    }

    public static List<Patient> getAllPatients() {
        return new ArrayList<>(allPatients);
    }

    public static List<Person> getAllStaff() {
        return new ArrayList<>(allStaff);
    }
}