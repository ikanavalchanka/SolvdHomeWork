package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.EquipmentNotFoundException;

import java.util.ArrayList;
import java.util.List;

class NeurologicalDepartment extends Department implements EquipmentManagement {
    private final int numberOfOperatingRooms;
    private final int numberOfNeuroSpecialists;
    private final List<String> equipmentList;

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
    public void removeEquipment(String equipment) throws EquipmentNotFoundException {
        if (equipmentList.contains(equipment)) {
            equipmentList.remove(equipment);
            System.out.println(equipment + " has been removed from the Neurological Department.");
        } else {
            throw new EquipmentNotFoundException("Equipment " + equipment + " not found in Neurological Department.");
        }
    }

    @Override
    public String getEquipmentStatus() {
        return "Equipment in Neurological Department: " + equipmentList.toString();
    }
}