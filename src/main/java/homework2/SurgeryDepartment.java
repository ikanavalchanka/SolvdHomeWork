package homework2;

class SurgeryDepartment extends Department {
    private int operatingRooms;

    public SurgeryDepartment(String departmentName, int operatingRooms) {
        super(departmentName);
        this.operatingRooms = operatingRooms;
    }

    public int getOperatingRooms() {
        return operatingRooms;
    }

    public void setOperatingRooms(int operatingRooms) {
        this.operatingRooms = operatingRooms;
    }
}
