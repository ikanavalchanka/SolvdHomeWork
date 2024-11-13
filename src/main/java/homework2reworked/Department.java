package homework2reworked;

import java.util.Objects;

abstract class Department {
    protected String departmentName;
    protected int numberOfBeds;
    protected int daysWithoutfatalities;

    public Department(String departmentName, int numberOfBeds, int daysWithoutfatalities) {
        this.departmentName = departmentName;
        this.numberOfBeds = numberOfBeds;
        this.daysWithoutfatalities = daysWithoutfatalities;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getDaysWithoutfatalities() {
        return daysWithoutfatalities;
    }

    public void setDaysWithoutfatalities(int daysWithoutfatalities) {
        this.daysWithoutfatalities = daysWithoutfatalities;
    }

    public abstract String departmentDescription();

    @Override
    public String toString() {
        return "Department [Name: " + departmentName + ", Beds: " + numberOfBeds + ", Days without fatalities: " + daysWithoutfatalities + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Department department = (Department) obj;
        return departmentName.equals(department.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName);
    }
}

