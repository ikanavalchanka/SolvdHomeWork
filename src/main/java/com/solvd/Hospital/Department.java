package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.EquipmentNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract class Department implements EquipmentManagement {
    protected String departmentName;
    protected int numberOfBeds;
    protected int daysWithoutFatalities;
    protected List<Doctor> doctors;
    protected List<String> equipmentList;

    public Department(String departmentName, int numberOfBeds, int daysWithoutFatalities, List<Doctor> doctors, List<String> equipmentList) {
        this.departmentName = departmentName;
        this.numberOfBeds = numberOfBeds;
        this.daysWithoutFatalities = daysWithoutFatalities;
        this.doctors = doctors;
        this.equipmentList = (equipmentList != null) ? equipmentList : new ArrayList<>();
    }

    public Department(String departmentName, int numberOfBeds, int daysWithoutFatalities, List<Doctor> doctors) {
        this(departmentName, numberOfBeds, daysWithoutFatalities, doctors, new ArrayList<>());
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getDaysWithoutFatalities() {
        return daysWithoutFatalities;
    }

    public void setDaysWithoutFatalities(int daysWithoutFatalities) {
        this.daysWithoutFatalities = daysWithoutFatalities;
    }

    abstract String departmentDescription();

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    @Override
    public void removeEquipment(String equipment) throws EquipmentNotFoundException {
        if (!equipmentList.contains(equipment)) {
            throw new EquipmentNotFoundException("Equipment " + equipment + " not found in department.");
        }
        equipmentList.remove(equipment);
        System.out.println(equipment + " removed from the department.");
    }

    public void addEquipment(String equipment) {
        equipmentList.add(equipment);
        System.out.println(equipment + " added to the department.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return numberOfBeds == that.numberOfBeds &&
                daysWithoutFatalities == that.daysWithoutFatalities &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(doctors, that.doctors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, numberOfBeds, daysWithoutFatalities, doctors);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", numberOfBeds=" + numberOfBeds +
                ", daysWithoutFatalities=" + daysWithoutFatalities +
                ", doctors=" + doctors +
                '}';
    }

    public String getEquipmentStatus() {
        return "Current equipment in the department: " + String.join(", ", equipmentList);
    }
}