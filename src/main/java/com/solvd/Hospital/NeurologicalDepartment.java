package com.solvd.Hospital;

import java.util.ArrayList;
import java.util.List;

class NeurologicalDepartment extends Department implements EquipmentManagement {
    private int numberOfOperatingRooms;
    private int numberOfNeuroSpecialists;
    private List<String> equipmentList;

    public NeurologicalDepartment(String departmentName, int numberOfBeds, int daysWithoutFatalities,
    List<Doctor> doctors, int numberOfOperatingRooms, int numberOfNeuroSpecialists) {
        super(departmentName, numberOfBeds, daysWithoutFatalities, doctors);
        this.numberOfOperatingRooms = numberOfOperatingRooms;
        this.numberOfNeuroSpecialists = numberOfNeuroSpecialists;
        this.equipmentList = new ArrayList<>();
    }

    @Override
    public String departmentDescription() {
        return "Department: " + getDepartmentName() + ", Beds: " + getNumberOfBeds() +
                ", Days without fatalities: " + getDaysWithoutFatalities() +
                ", Operating Rooms: " + numberOfOperatingRooms +
                ", Neuro Specialists: " + numberOfNeuroSpecialists;
    }

    @Override
    public void addEquipment(String equipment) {
        equipmentList.add(equipment);
        System.out.println(equipment + " has been added to the Neurological Department.");
    }

    @Override
    public void removeEquipment(String equipment) {
        if (equipmentList.contains(equipment)) {
            equipmentList.remove(equipment);
            System.out.println(equipment + " has been removed from the Neurological Department.");
        } else {
            System.out.println("Equipment not found.");
        }
    }

    @Override
    public String getEquipmentStatus() {
        return "Equipment in Neurological Department: " + equipmentList.toString();
    }
}