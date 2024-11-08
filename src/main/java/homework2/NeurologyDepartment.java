package homework2;

class NeurologyDepartment extends Department {
    private int numberOfNeurologists;
    private int numberOfFreeBeds;

    public NeurologyDepartment(String departmentName, int numberOfNeurologists, int numberOfFreeBeds) {
        super(departmentName);
        this.numberOfNeurologists = numberOfNeurologists;
        this.numberOfFreeBeds = numberOfFreeBeds;
    }

    public int getNumberOfNeurologists() {
        return numberOfNeurologists;
    }

    public void setNumberOfNeurologists(int numberOfNeurologists) {
        this.numberOfNeurologists = numberOfNeurologists;
    }

    public int getNumberOfFreeBeds() {
        return numberOfFreeBeds;
    }

    public void setNumberOfFreeBeds(int numberOfFreeBeds) {
        this.numberOfFreeBeds = numberOfFreeBeds;
    }
}