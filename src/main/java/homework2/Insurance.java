package homework2;

 class Insurance {
     private String insuranceProvider;
     private double insuranceAmount;

     public Insurance(String insuranceProvider, double insuranceAmount) {
         this.insuranceProvider = insuranceProvider;
         this.insuranceAmount = insuranceAmount;

     }

     public String getInsuranceProvider() {
         return insuranceProvider;
     }

     public void setInsuranceProvider(String insuranceProvider) {
         this.insuranceProvider = insuranceProvider;
     }

     public double getInsuranceAmount() {
         return insuranceAmount;
     }

     public void setInsuranceAmount(double insuranceAmount) {
         this.insuranceAmount = insuranceAmount;
     }
 }
