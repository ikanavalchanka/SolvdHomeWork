package homework2;

class Nurse extends Person {
    private Department nurseDepartment;

    public Nurse(String name, int age, String gender, Department nurseDepartment) {
        super(name, age, gender);
        this.nurseDepartment = nurseDepartment;
    }

    public Department getNurseDepartment() {
        return nurseDepartment;
    }

    public void setNurseDepartment(Department nurseDepartment) {
        this.nurseDepartment = nurseDepartment;
    }
}
