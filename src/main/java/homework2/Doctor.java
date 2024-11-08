package homework2;

class Doctor extends Person {
    private String speciality;
    private Department department;

    public Doctor(String name, int age, String gender, String speciality, Department department) {
        super(name, age, gender);
        this.speciality = speciality;
        this.department = department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
