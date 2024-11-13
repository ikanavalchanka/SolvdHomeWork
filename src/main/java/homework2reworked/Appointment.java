package homework2reworked;

class Appointment {
    private String doctorName;
    private String appointmentTime;

    public Appointment(String doctorName, String appointmentTime) {
        this.doctorName = doctorName;
        this.appointmentTime = appointmentTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment with Dr. " + doctorName + " at " + appointmentTime;
    }
}
