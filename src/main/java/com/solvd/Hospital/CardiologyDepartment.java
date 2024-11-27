package com.solvd.Hospital;

import java.util.List;

class CardiologyDepartment extends Department {
    private final int numberOfCardiologists;
    private final boolean hasAdvancedCardiacMachines;

    public CardiologyDepartment(String departmentName, int numberOfBeds, int daysWithoutFatalities, List<Doctor> doctors,
                                int numberOfCardiologists, boolean hasAdvancedCardiacMachines) {
        super(departmentName, numberOfBeds, daysWithoutFatalities, doctors);
        this.numberOfCardiologists = numberOfCardiologists;
        this.hasAdvancedCardiacMachines = hasAdvancedCardiacMachines;
    }

    @Override
    public String departmentDescription() {

        return "Department: " + getDepartmentName() +
                ", Number of beds: " + getNumberOfBeds() +
                ", Days without fatalities: " + getDaysWithoutFatalities() +
                ", Cardiologists: " + numberOfCardiologists +
                ", Advanced Cardiac Machines: " + (hasAdvancedCardiacMachines ? "Yes" : "No");
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