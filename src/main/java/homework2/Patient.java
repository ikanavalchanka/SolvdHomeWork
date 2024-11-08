package homework2;

class Patient extends Person {
    private String illness;
    private int patientId;
    private Department department;

    public Patient(String name, int age, String gender, String illness, int patientId, Department department) {
        super(name, age, gender);
        this.illness = illness;
        this.patientId = patientId;
        this.department = department;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
