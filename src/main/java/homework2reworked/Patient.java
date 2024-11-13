package homework2reworked;

import java.util.Objects;

class Patient extends Person {
    protected String patientId;
    protected String illness;
    protected String department;

    public Patient(String name, int age, String gender, String patientId, String illness, String department) {
        super(name, age, gender);
        this.patientId = patientId;
        this.illness = illness;
        this.department = department;
    }

    @Override
    public String personDescription() {
        return "Patient with illness: " + illness;
    }

    @Override
    public String toString() {
        return "Patient [ID: " + patientId + ", Name: " + name + ", Illness: " + illness + ", Department: " + department + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Patient patient = (Patient) obj;
        return patientId.equals(patient.patientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId);
    }
}
