package com.solvd.Hospital;

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String appointmentDate;

    public Appointment(Doctor doctor, Patient patient, String appointmentDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment with Dr. " + doctor.getName() + " for patient " + patient.getName() + " on " + appointmentDate;
    }
}