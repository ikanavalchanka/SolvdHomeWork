package homework2;

class CardiologyDepartment extends Department {
    private int numberOfSurgeons;
    private boolean hasDefibrillator;

    public CardiologyDepartment(String departmentName, int numberOfSurgeons, boolean hasDefibrillator) {
        super(departmentName);
        this.numberOfSurgeons = numberOfSurgeons;
        this.hasDefibrillator = hasDefibrillator;
    }

    public int getNumberOfSurgeons() {
        return numberOfSurgeons;
    }

    public void setNumberOfSurgeons(int numberOfSurgeons) {
        this.numberOfSurgeons = numberOfSurgeons;
    }

    public boolean hasDefibrillator() {
        return hasDefibrillator;
    }

    public void setHasDefibrillator(boolean hasDefibrillator) {
        this.hasDefibrillator = hasDefibrillator;
    }
}

