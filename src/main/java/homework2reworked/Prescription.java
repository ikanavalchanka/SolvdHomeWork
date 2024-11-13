package homework2reworked;

class Prescription {
    private String medicineName;
    private int dosage;

    public Prescription(String medicineName, int dosage) {
        this.medicineName = medicineName;
        this.dosage = dosage;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medicine: " + medicineName + ", Dosage: " + dosage + "mg";
    }
}