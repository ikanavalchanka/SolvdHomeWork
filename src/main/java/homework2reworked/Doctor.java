package homework2reworked;

import java.util.Objects;

class Doctor extends Person {
    private String speciality;
    private String hospitalDepartment;

    public Doctor(String name, int age, String gender, String speciality, String hospitalDepartment) {
        super(name, age, gender);
        this.speciality = speciality;
        this.hospitalDepartment = hospitalDepartment;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHospitalDepartment() {
        return hospitalDepartment;
    }

    public void setHospitalDepartment(String hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment;
    }

    @Override
    public String personDescription() {
        return "Doctor" + speciality;
    }

    @Override
    public String toString() {
        return "Doctor [Name: " + name + ", Speciality: " + speciality + ", Department: " + hospitalDepartment + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Doctor doctor = (Doctor) obj;
        return speciality.equals(doctor.speciality) && hospitalDepartment.equals(doctor.hospitalDepartment);  // Сравниваем по speciality и hospitalDepartment
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciality, hospitalDepartment);  // Генерация hashCode на основе speciality и hospitalDepartment
    }

}

