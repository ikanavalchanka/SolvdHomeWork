package homework2reworked;

class SurgeryDepartment extends Department {
    public SurgeryDepartment(String departmentName, int numberOfBeds, int daysWithoutfatalities) {
        super(departmentName, numberOfBeds, daysWithoutfatalities);
    }

    @Override
    public String departmentDescription() {
        return "Department: " + departmentName + ", Number of beds:" + numberOfBeds + " Days without fatalities: " + daysWithoutfatalities;
    }
}
