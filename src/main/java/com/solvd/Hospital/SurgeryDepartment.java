package com.solvd.Hospital;

import java.util.List;

class SurgeryDepartment extends Department {
    private final int numberOfSurgeriesPerMonth;
    private final boolean hasEmergencySurgeryCapability;

    public SurgeryDepartment(String departmentName, int numberOfBeds, int daysWithoutFatalities, List<Doctor> doctors,
                             int numberOfSurgeriesPerMonth, boolean hasEmergencySurgeryCapability) {
        super(departmentName, numberOfBeds, daysWithoutFatalities, doctors);
        this.numberOfSurgeriesPerMonth = numberOfSurgeriesPerMonth;
        this.hasEmergencySurgeryCapability = hasEmergencySurgeryCapability;
    }

    @Override
    public String departmentDescription() {

        return "Department: " + getDepartmentName() + ", Beds: " + getNumberOfBeds() +
                ", Days without fatalities: " + getDaysWithoutFatalities() +
                ", Surgeries per month: " + numberOfSurgeriesPerMonth +
                ", Emergency Surgery Capability: " + (hasEmergencySurgeryCapability ? "Yes" : "No");
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