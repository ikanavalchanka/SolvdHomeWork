package homework2reworked;

class CardiologyDepartment extends Department {
    public CardiologyDepartment(String departmentName, int numberOfBeds, int daysWithoutfatalities) {
        super(departmentName, numberOfBeds, daysWithoutfatalities);
    }

    @Override
    public String departmentDescription() {
        return "Department: " + departmentName + ", Number of beds:" + numberOfBeds + " Days without fatalities: " + daysWithoutfatalities;
    }
}
