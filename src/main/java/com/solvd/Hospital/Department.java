package com.solvd.Hospital;

import java.util.Objects;
import java.util.List;

abstract class Department {
    protected String departmentName;
    protected int numberOfBeds;
    protected int daysWithoutFatalities;
    protected List<Doctor> doctors;

    public Department(String departmentName, int numberOfBeds, int daysWithoutFatalities, List<Doctor> doctors) {
        this.departmentName = departmentName;
        this.numberOfBeds = numberOfBeds;
        this.daysWithoutFatalities = daysWithoutFatalities;
        this.doctors = doctors;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return numberOfBeds == that.numberOfBeds && daysWithoutFatalities == that.daysWithoutFatalities && Objects.equals(departmentName, that.departmentName) && Objects.equals(doctors, that.doctors);
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
}

