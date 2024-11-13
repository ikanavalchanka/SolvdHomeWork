package homework2reworked;

class NeurologicalDepartment extends Department {
    public NeurologicalDepartment(String departmentName, int numberOfBeds, int daysWithoutfatalities) {
        super(departmentName, numberOfBeds, daysWithoutfatalities);
    }

    @Override
    public String departmentDescription() {
        return "Department: " + departmentName + ", Number of beds:" + numberOfBeds + " Days without fatalities: " + daysWithoutfatalities;
    }
}
