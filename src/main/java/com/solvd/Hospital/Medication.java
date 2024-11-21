package com.solvd.Hospital;

class Medication {
    private String name;
    private String type;
    private String dosage;

    public Medication(String name, String type, String dosage) {
        this.name = name;
        this.type = type;
        this.dosage = dosage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medication: " + name + ", Type: " + type + ", Dosage: " + dosage;
    }
}