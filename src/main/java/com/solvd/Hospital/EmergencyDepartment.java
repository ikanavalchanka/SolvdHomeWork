package com.solvd.Hospital;

import java.util.List;

class EmergencyDepartment extends Department {
    private final int numberOfAmbulances;
    private final boolean has24HourService;

    public EmergencyDepartment(String departmentName, int numberOfBeds, int daysWithoutFatalities, List<Doctor> doctors,
                               int numberOfAmbulances, boolean has24HourService) {
        super(departmentName, numberOfBeds, daysWithoutFatalities, doctors);
        this.numberOfAmbulances = numberOfAmbulances;
        this.has24HourService = has24HourService;
    }

    @Override
    public String departmentDescription() {
        return "Department: " + getDepartmentName() +
                ", Number of beds: " + getNumberOfBeds() +
                ", Days without fatalities: " + getDaysWithoutFatalities() +
                ", Ambulances: " + numberOfAmbulances +
                ", 24 Hour Service: " + (has24HourService ? "Yes" : "No");
    }

    @Override
    public void addEquipment(String equipment) {

    }

    @Override
    public void removeEquipment(String equipment) {

    }

    @Override
    public String getEquipmentStatus() {
        return null;
    }
}