package com.solvd.Hospital;

import java.util.Objects;

class Patient extends Person {
    private String patientId;
    private String illness;
    private String department;

    // Конструктор теперь принимает все необходимые параметры
    public Patient(String name, int age, String gender, String patientId, String illness, String department) {
        super(name, age, gender);
        this.patientId = patientId;
        this.illness = illness;
        this.department = department;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String personDescription() {
        return "Patient with " + illness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(patientId, patient.patientId) && Objects.equals(illness, patient.illness) && Objects.equals(department, patient.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, illness, department);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", illness='" + illness + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}