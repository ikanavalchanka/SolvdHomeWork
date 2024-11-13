package homework2reworked;

class Nurse extends Person {
    private String nurseDepartment;

    public Nurse(String name, int age, String gender, String nurseDepartment) {
        super(name, age, gender);
        this.nurseDepartment = nurseDepartment;
    }

    public String getNurseDepartment() {
        return nurseDepartment;
    }

    public void setNurseDepartment(String nurseDepartment) {
        this.nurseDepartment = nurseDepartment;
    }

    @Override
    public String personDescription() {
        return "Nurse at " + nurseDepartment;
    }

    @Override
    public String toString() {
        return "Nurse [Name: " + name + ", Department: " + nurseDepartment + ", Age: " + age + ", Gender: " + gender + "]";
    }
}

