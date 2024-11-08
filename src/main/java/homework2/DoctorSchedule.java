package homework2;

public class DoctorSchedule {
    private String doctorName;
    private String shiftTime;

    public DoctorSchedule(String doctorName, String shiftTime) {
        this.doctorName = doctorName;
        this.shiftTime = shiftTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }
}