package com.solvd.Hospital;

class Hospital {
    private static int totalPatients;

    static {

        totalPatients = 4;
        System.out.println("Hospital system initialized.");
    }

    public static void incrementPatientCount() {
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }
}
