package com.solvd.Hospital.customLinkedList;

public class MainClass {
    public static void main(String[] args) {

        LinkedList<Patient> patientList = new LinkedList<>();

        Patient p1 = new Patient(1, "Alice", "Fever");
        Patient p2 = new Patient(2, "Bob", "Fracture");
        Patient p3 = new Patient(3, "Charlie", "Headache");

        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);

        System.out.println("Patients in the hospital:");
        patientList.printList();

        System.out.println("\nRemoving patient with ID 2...");
        patientList.remove(2);


        System.out.println("\nUpdated list of patients:");
        patientList.printList();

        System.out.println("\nTotal number of patients: " + patientList.size());
    }
}