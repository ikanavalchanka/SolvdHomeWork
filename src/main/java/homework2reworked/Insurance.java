package homework2reworked;

class Insurance {
    private String insuranceCompany;
    private String policyNumber;

    public Insurance(String insuranceCompany, String policyNumber) {
        this.insuranceCompany = insuranceCompany;
        this.policyNumber = policyNumber;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public String toString() {
        return "Insurance by " + insuranceCompany + ", Policy No: " + policyNumber;
    }
}
