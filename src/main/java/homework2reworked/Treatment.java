package homework2reworked;

class Treatment {
    private String treatmentName;
    private String description;

    public Treatment(String treatmentName, String description) {
        this.treatmentName = treatmentName;
        this.description = description;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Treatment: " + treatmentName + ", Description: " + description;
    }
}