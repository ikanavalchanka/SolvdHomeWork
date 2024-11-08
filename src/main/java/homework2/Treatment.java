package homework2;

    class Treatment {
        private String treatmentType;
        private int durationInDays;

        public Treatment(String treatmentType, int durationInDays) {
            this.treatmentType = treatmentType;
            this.durationInDays = durationInDays;
        }

        public String getTreatmentType() {
            return treatmentType;
        }

        public void setTreatmentType(String treatmentType) {
            this.treatmentType = treatmentType;
        }

        public int getDurationInDays() {
            return durationInDays;
        }

        public void setDurationInDays(int durationInDays) {
            this.durationInDays = durationInDays;
        }
    }
