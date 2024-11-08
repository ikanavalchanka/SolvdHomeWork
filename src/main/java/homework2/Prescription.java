package homework2;

public class Prescription {
    private String medicineName;
    private int medicineDosage;

    public Prescription(String medicineName, int medicineDosage) {
        this.medicineName = medicineName;
        this.medicineDosage = medicineDosage;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMedicineDosage() {
        return medicineDosage;
    }

    public void setMedicineDosage(int medicineDosage) {
        this.medicineDosage = medicineDosage;
    }
}
