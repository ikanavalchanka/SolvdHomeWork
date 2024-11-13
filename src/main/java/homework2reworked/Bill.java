package homework2reworked;

class Bill {
    private double totalAmount;
    private String patientId;

    public Bill(double totalAmount, String patientId) {
        this.totalAmount = totalAmount;
        this.patientId = patientId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Bill for patient " + patientId + ", Total: " + totalAmount;
    }
}